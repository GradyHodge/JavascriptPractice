import React, { Component } from 'react';
import { Row, Col, Button  } from 'reactstrap';
import moment from "moment";
import API from '../../../utils/API';
import TextCard from '../../parts/TextCard';
import UserSignUp from '../../parts/SignUp/UserSignUp';
import SweetAlert from 'react-bootstrap-sweetalert';
import EditUser from '../../parts/Models/EditUser';
import LogIn from '../../parts/Models/LogIn';
const mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

class Home extends Component{
    constructor(props){
        super(props);

        // These are base state aspects that makes this page work
        this.state = {

            // User api data pool
            userPool: [],

            // Add user form
            addName: "",
            addUsername: "",
            addEmail: "",
            addPassword: "",
            addPhoneNum: 0,

            // Model attrs
            show: false,
            title: "Sweetie",
            text: null,

            // Update user info form
            updateName: "",
            updateUsername: "",
            updateEmail: "",
            updatePassword: "",
            updatePhoneNum: "",

            // Log in user form
            logInUsername: "",
            logInPassword: "",
        }
    }

    // When page loads see inital state value
    componentDidMount(){
        // console.log("Mount State: " , this.state);
        this.getUsers();
        if(localStorage.getItem("token")){
            localStorage.removeItem("token");
        }
    }

    // Every time state changes this function fires to give you a update all changes and thier values
    // componentDidUpdate(){
        // console.log("Updated State: ", this.state);
        // console.log("token present", localStorage.getItem("token"))
    // }

    // General handler for inputs thats value is to change the state
    // If state does not exsist it makes a state field with its name
    handleInputChange = event => {
        const { name, value } = event.target;
        this.setState({
          [name]: value
        });
    }

    validateEmailInput = email => {
        if(!email.match(mailformat)){
            this.setState({
                title: "Error",
                text: "Email not in correct format.",
                show: true
            });
            return false;
        }
        else return true;
    }

    // Function that handles adding a customer to the db
    signUpUser = async () => {
        // console.log("Add user state: ", this.state);
        const s = this.state;
        // Check that email is in correct format
        if(this.validateEmailInput(s.addEmail));
        else return;
        if (
            !s.addName ||
            !s.addUsername ||
            !s.addEmail ||
            !s.addPassword ||
            !s.addPhoneNum
        ) {
        // If failed block submit and show alert
        this.setState({
            title: "Error",
            text: "Please fill out all fields before creating your profile",
            show: true
        });
        return;
        }

        // Sends info of to util api call
        API.addUser({
            name: s.addName,
            username: s.addUsername,
            email: s.addEmail,
            password: s.addPassword,
            phone_num: s.addPhoneNum,
            createdAt: moment().format("dddd, MMMM Do YYYY, h:mm:ss a")
        })
        .catch(err=>console.error("You hit an error: ",err))
        .then(res => {
            // console.log("Add user res:", res);
            // Comment back in for deployment but comment out for testing inputs
            window.location.reload(false);
        })
    };

    // Grabs all users in db and displays them on the DOM
    getUsers= async () => {
        // console.log("Get users: ", this.state);
        // When users are pulled from the db the are put into an array. That array when it contains info loops and makes cards for each user
        API.getUsers().then(res => this.setState({ userPool: res.data }))
        .catch(err => console.error(err));
    }

    // Function that handles the deleting of a single user from the db
    // This will be tied to a button that is tied to a specific user
    deleteUser = id => {
        // console.log("Delete function started");
        alert("You are deleting someting from the db!");
        // Send request to util api call
        API.deleteUser(id).then(res => {
            // console.log("Delete response:", res);
            this.getUsers()
        })
    }

    // Sweet alert model that contains form for PUT operations 
    editUserModal = user => {
        this.setState({ 
            updateName: user.name,
            updateUserame: user.username,
            updateEmail: user.email,
            updatePassword: user.password,
            updatePhoneNum: user.phone_num
        });
        
        let text = (
          <div>
            <EditUser 
                handleInputChange={this.handleInputChange}
                handleUpdateFormSubmit={this.handleUpdateFormSubmit}
                user={user}
            />
          </div>
        )
        // Update state to show model
        this.setState({
          title: user.name,
          text: text,
          show: true
        })
    }

    // When the update form on the model is submitted this function fires
    handleUpdateFormSubmit = (id) => {
        let s = this.state;
        // Check that email is in correct format
        if(this.validateEmailInput(s.updateEmail));
        else return;
        // If one of the form fields has no value block submit
        if (
          !s.updateName ||
          !s.updateUsername ||
          !s.updateEmail ||
          !s.updatePassword ||
          !s.updatePhoneNum
        ) {
          // If failed block submit and show alert
          this.setState({
            title: "Error",
            text: "Please fill out all fields before submitting form.",
            show: true
          });
          return;
        }
        // Send field info to db using utils api call
        API.updateUser(id, {
            name: s.updateName,
            username: s.updateUsername,
            email: s.updateEmail,
            password: s.updatePassword,
            phone_num: s.updatePhoneNum,
            updatedAt: moment().format("dddd, MMMM Do YYYY, h:mm:ss a")
        })
        // After form submits call function to get all users to see updated info and close model
        .then(() => {
            // console.log("User updated");
            this.getUsers();
            this.setState({ show : false});
        })
    }

    signInModel = () => {
        let text = (
            <LogIn
                handleInputChange={this.props.handleChange}
                logIn={this.props.logIn}
            />
        );
        // Update state to show model
        this.setState({
        title: "Sign into your account",
        text: text,
        show: true
        })
    }

    render() {
        
        return (
            <div className="pt-4">

                {/* Generic model waiting for function to show and fill it */}
                <SweetAlert
                    show={this.state.show}
                    title={this.state.title}
                    onConfirm={() => this.setState({ show: false })}
                    style={{ minWidth: "35%" }}
                >
                    <div style={styles.sweetBox}>
                        {this.state.text}
                    </div>
                </SweetAlert>

                <Row className="mx-auto">

                    {/* Add user form */}
                    <Col lg="6" className="mx-auto">
                        <TextCard 
                            title="Basic component"
                            subtitle="DB test form">
                                <Button className="m-1" color="info" onClick={() => this.getUsers()}>
                                    Get all users in DB
                                </Button>

                                <Button className="m-1" color="primary" onClick={() => this.signInModel()}>
                                    Log in
                                </Button>
                                
                                {/* Sign up component holds the actual form inside of another component files kept nested to 
                                    help with organization  */}
                                <UserSignUp 
                                    handleInputChange={this.handleInputChange}
                                    handleFormSubmit={this.signUpUser}
                                />
                        </TextCard>

                    </Col>
                    

                    {/* See all users in db */}
                    <Col lg="6" className="mx-auto">
                        {this.state.userPool.length ? (
                            <div>
                                {this.state.userPool.map((user) => {
                                    return(
                                        <TextCard
                                        key={user._id}
                                        title={`Name: ${user.name}`}
                                        subtitle={`Username: ${user.username}`}
                                        >
                                            {/* Show other user information as children */}
                                            <span><h6>Phone number:</h6> <p>{user.phone_num}</p></span>
                                            <span><h6>Email:</h6> <p>{user.email}</p></span>
                                            <span><h6>Password:</h6> <p>{user.password}</p></span>
                                            {/* Delete this user button */}
                                            <Button className="m-1" color="danger" onClick={() => this.deleteUser(user._id)}>
                                                Delete
                                            </Button>
                                            {/* Edit user button */}
                                            <Button className="m-1" color="info" onClick={() =>  this.editUserModal(user)}>
                                                Edit
                                            </Button>
                                        </TextCard>
                                    )
                                })}
                            </div>
                            // If nothing is in array display empty p tag
                        ) : (<p></p>)}
                    </Col>

                </Row>
                
                
            </div>
        );
    }
}

const styles = {
    sweetBox:{ 
        maxHeight: "50vh", 
        minWidth: "35%", 
        overflow: "auto" 
    }
}

export default Home;
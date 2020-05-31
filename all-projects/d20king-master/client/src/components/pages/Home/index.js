import React, { Component } from "react";
import { Row, Col, Button } from "reactstrap";
import SweetAlert from "react-bootstrap-sweetalert";
import UserForm from "components/parts/UserForm";
// import TextCard from 'components/parts/TextCard';
import API from "utils/API";
import LogIn from "components/parts/LogIn";
import Flextron from "components/parts/FlexTron";
import RulesList from "components/parts/RulesList";
import SkillsTabel from "components/parts/SkillsTabel";

import "./sass/main.css";

class Home extends Component {
  constructor(props) {
    super(props);

    this.state = {
      // User api data pool
      userPool: [],
      // Modal attributes
      show: false,
      title: "Sweetie",
      text: null,
    };
  }

  componentDidMount() {
    if (localStorage.getItem("token")) {
      this.props.authenticate();
    }
  }

  componentDidUpdate() {
    console.log("Home component update", this.state);
  }

  getUsers = () => {
    API.getUsers()
      .then((res) => this.setState({ userPool: res.data }))
      .catch((err) => console.error("Get users error", err));
  };

  editUser = (user) => {
    this.setState({
      show: true,
      title: "Edit info",
      text: (
        <UserForm
          type="edit"
          user={user}
          hide={() => this.setState({ show: false })}
        />
      ),
    });
    this.getUsers();
  };

  deleteUser = (id) => {
    API.deleteUser(id)
      .then((res) => console.log("Delete user res", res))
      .catch((err) => console.error("Delete user error", err));
    this.getUsers();
  };

  localLogin = () => {
    this.props.logIn();
    this.setState({ show: false });
  };

  logInPopUp = () => {
    this.setState({
      show: true,
      title: "Log In",
      text: (
        <LogIn handleChange={this.props.handleChange} logIn={this.localLogin} />
      ),
    });
  };

  signUpPopUp = () => {
    this.setState({
      show: true,
      title: "Sign Up",
      text: <UserForm type="create" />,
    });
  };

  render() {
    const { show, title, text } = this.state;
    return (
      <div>
        {/* Generic model waiting for function to show and fill it */}
        <SweetAlert
          show={show}
          title={title}
          onConfirm={() => this.setState({ show: false })}
          confirmBtnText="Close"
          confirmBtnStyle={{ backgroundColor: "red" }}
          className="center"
        >
          <div className="sweetbox">{text}</div>
        </SweetAlert>

        <Row className="justify">
          <Col className="mt-5" sm="11">
            <Flextron
              title="D20 King"
              subtitle="Simplified DnD homebrew"
              className="hpHeader"
            >
              <Button
                className="m-3"
                color="primary"
                onClick={() => this.logInPopUp()}
              >
                Log In
              </Button>
              <Button
                className="m-3"
                color="success"
                onClick={() => this.signUpPopUp()}
              >
                Sign Up
              </Button>
            </Flextron>
          </Col>

          <Col sm="11">
            <RulesList />
          </Col>

          <Col sm="11">
            <SkillsTabel />
          </Col>
        </Row>
      </div>
    );
  }
}

// const styles = {
//   center: {
//     justifyContent: "center",
//   },
//   sweetBox: {
//     maxHeight: "50vh",
//     minWidth: "50%",
//     overflow: "auto",
//   },
// };

export default Home;

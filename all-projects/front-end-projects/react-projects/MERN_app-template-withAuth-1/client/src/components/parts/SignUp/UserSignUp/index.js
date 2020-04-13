import React from 'react';
import Flextron from "../../FlexTron";
import TextCard from "../../TextCard";
import UserSignUpForm from './UserSignUpForm';

// Basic signup component that holds its specific form inside it
// Gives simple interface for adding users to db
// Rinse and repeat for new tables in db.

const UserSignUp = (props) => {
    
    return(
        <div className={props.className} >
                <Flextron
                    title="Join Today!"
                    subtitle="Become a member of the db!"
                >
                    <p>Fill out form to add to user table</p>

                    <TextCard 
                        title="Sign Up Card"
                        subtitle="Fill out info and sign up"
                        style={{backgroundColor:"#fff"}}
                    >
                        <UserSignUpForm 
                            handleInputChange={props.handleInputChange}
                            handleFormSubmit={props.handleFormSubmit}
                        />
                    </TextCard>
                </Flextron>

        </div>
    )
}

export default UserSignUp;
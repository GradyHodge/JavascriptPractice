import React, { Component } from "react";
import { Row, Col } from "reactstrap";

import TextCard from "components/parts/TextCard";
import CreateCharacterForm from "components/parts/CreateCharacterForm";
import CreateCampaignForm from "components/parts/CreateCampaignForm";
import CreateStorybookForm from "components/parts/CreateStorybookForm";

class UserHome extends Component {
  constructor(props) {
    super(props);

    this.state = {
      user: this.props.user,
    };
  }

  componentDidMount() {
    console.log("UserHome mount state", this.state);
  }
  // componentDidUpdate(){
  //     console.log("UserHome updated state", this.state);
  // }

  render() {
    const { user } = this.state;
    return (
      <div>
        <TextCard
          title={`Name: ${user.name}`}
          subtitle={`Username: ${user.username}`}
        >
          <ul>
            <li>{user.email}</li>
          </ul>

          <button
            type="button"
            className="btn btn-danger m-1"
            onClick={this.props.signOut}
          >
            Sign out
          </button>
        </TextCard>

        <Row className="bg-light">
          <Col sm="4">
            <h4>Create Character</h4>
            <CreateCharacterForm />
          </Col>

          <Col sm="4">
          <h4>Create Campaign</h4>
            <CreateCampaignForm />
          </Col>

          <Col sm="4">
          <h4>Create Storybook</h4>
            <CreateStorybookForm />
          </Col>
        </Row>
      </div>
    );
  }
}

export default UserHome;

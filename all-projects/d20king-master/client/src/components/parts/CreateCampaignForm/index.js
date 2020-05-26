import React, { Component } from "react";
import { Form, FormGroup, Input, Label, Button } from "reactstrap";
import API from "utils/API";

class CreateCampaignForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      description: "",
      location: "",
      homebrewRules: [],
      playerCharacters: [],
      storybook: {},
    };
  }

  componentDidUpdate() {
    console.log("Create Campaign Form update state", this.state);
  }

  handleInputChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  handleSubmit = () => {
    let s = this.state;
    let allGood = true;
    if (!s.name || !s.description || !s.location) {
      allGood = false;
      return alert("All fields are required to make a basic campaign.");
    }
    if (allGood) {
      API.addUser({
        name: s.name,
        description: s.description,
        location: s.location,
        homebrewRules: s.homebrewRules,
        playerCharacters: s.playerCharacters,
        storybook: s.storybook,
      })
        .then((res) => {
          console.log("Create campaign res", res);
          this.setState({
            name: "",
            description: "",
            location: "",
            homebrewRules: [],
            playerCharacters: [],
            storybook: {},
          });
        })
        .catch((err) => console.error("Create campaign error", err));
    } else console.error("Handle submit hit an error");
  };

  render() {
    const {
      name,
      description,
      location,
      homebrewRules,
      playerCharacters,
      storybook,
    } = this.state;
    return (
      <Form>
        <FormGroup className="form-group">
          <Label for="campaignName-input">Name</Label>
          <Input
            value={name}
            type="text"
            name="campaignName-input"
            onChange={this.handleInputChange}
            id="campaignName-input"
            placeholder="Tales of Meridia"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="campaignDescription-input">Description</Label>
          <textarea
            rows="5"
            value={description}
            type="text"
            name="campaignDescription-input"
            onChange={this.handleInputChange}
            id="campaignDescription-input"
            className="form-control"
            placeholder="Leroy Jenkens"
          />
          <p className="tipText">
            This will be visible to your players to give them an idea of what
            the general plot is.
          </p>
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="campaignLocation-input">Location</Label>
          <Input
            value={location}
            type="email"
            name="campaignLocation-input"
            onChange={this.handleInputChange}
            id="campaignLocation-input"
            placeholder="Sword Coast, Northern"
          />
          <p className="tipText">
            This will be visible to your players to give them an idea of where
            this adventure happens.
          </p>
        </FormGroup>

        {/* <FormGroup className="form-group">
          <Label for="playerCharacterSelector">Player Characters</Label>
          <Input
            value={`${this.state[`${type}Password`]}`}
            type="password"
            name={`${type}Password`}
            onChange={this.handleInputChange}
            id={`${type}Password`}
            placeholder="password2020"
          />
		  	<p className="tipText">
				This will be where you can look up and add players to your campaign.
			</p>
        </FormGroup>

		<FormGroup className="form-group">
          <Label for="campaignStorybook">Story/Module</Label>
          <Input
            value={`${this.state[`${type}Password`]}`}
            type="password"
            name={`${type}Password`}
            onChange={this.handleInputChange}
            id={`${type}Password`}
            placeholder="password2020"
          />
		  	<p className="tipText">
				This will be where you can look up stories and attach them to your campaign.
			</p>
        </FormGroup> */}

        <Button onClick={this.handleSubmit} color="success">
          Submit
        </Button>
      </Form>
    );
  }
}

export default CreateCampaignForm;

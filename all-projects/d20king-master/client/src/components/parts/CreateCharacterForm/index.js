import React, { Component } from "react";
import { Form, FormGroup, Input, Label, Button } from "reactstrap";
import API from "utils/API";

class CreateCharacterForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      charClass: "",
      race: "",
      backstory: "",
    };
  }

  componentDidUpdate() {
    console.log("User form update state", this.state);
  }

  handleInputChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  handleSubmit = () => {
    let s = this.state;
    let allGood = true;
    if (!s.name || !s.charClass || !s.race || !s.backstory) {
      allGood = false;
      return alert("All fields are required to make a basic character.");
    }
    if (allGood) {
      API.addUser({
        name: s.name,
        charClass: s.charClass,
        race: s.race,
        backstory: s.backstory,
      })
        .then((res) => {
          console.log("Create character res", res);
          this.setState({
            name: "",
            charClass: "",
            race: "",
            backstory: "",
          });
        })
        .catch((err) => console.error("Create character error", err));
    } else console.error("Handle submit hit an error");
  };

  render() {
    const { name, charClass, race, backstory } = this.state;
    return (
      <Form>
        <FormGroup className="form-group">
          <Label for="characterName-input">Name</Label>
          <Input
            value={name}
            type="text"
            name="characterName-input"
            onChange={this.handleInputChange}
            id="characterName-input"
            placeholder="Galmar Sonefist"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="characterClass-input">Class</Label>
          <Input
            value={charClass}
            type="text"
            name="characterClass-input"
            onChange={this.handleInputChange}
            id="characterClass-input"
            placeholder="Barbarian"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="characterRace-input">Race</Label>
          <Input
            value={race}
            type="text"
            name="characterRace-input"
            onChange={this.handleInputChange}
            id="characterRace-input"
            placeholder="Dwarf"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="characterBackstory-input">Backstory</Label>
          <textarea
            rows="3"
            value={backstory}
            type="text"
            name="characterBackstory-input"
            onChange={this.handleInputChange}
            id="characterBackstory-input"
            className="form-control"
            placeholder="Tell your story here..."
          />
        </FormGroup>

        <Button onClick={this.handleSubmit} color="success">
          Submit
        </Button>
      </Form>
    );
  }
}

export default CreateCharacterForm;

import React, { Component} from "react";
import {
  Form,
  FormGroup,
  Input,
  Label,
  Button,
} from "reactstrap";
import API from "utils/API";

class CreateStorybookForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      description: "",
      location: "",
      genre: "",
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
    if (!s.name || !s.description || !s.location || !s.genre) {
      allGood = false;
      return alert("All fields are required to make a basic story.");
    }
    if (allGood) {
      API.addUser({
        name: s.name,
        description: s.description,
        location: s.location,
        genre: s.genre,
      })
        .then((res) => {
          console.log("Create story res", res);
          this.setState({
            name: "",
            description: "",
            location: "",
            genre: "",
          });
        })
        .catch((err) => console.error("Create story error", err));
    } else console.error("Handle submit hit an error");
  };

  render() {
    const { name, description, location, genre } = this.state;
    return (
      <Form>
        <FormGroup className="form-group">
          <Label for="storyName-input">Name</Label>
          <Input
            value={name}
            type="text"
            name="storyName-input"
            onChange={this.handleInputChange}
            id="storyName-input"
            placeholder="Tomb of Doom"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="storyDescription-input">Description</Label>
          <textarea
            value={description}
            type="text"
            rows="5"
            name="storyDescription-input"
            onChange={this.handleInputChange}
            id="storyDescription-input"
            className="form-control"
            placeholder="Give a basic outline of story"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="storyLocation-input">Location</Label>
          <Input
            value={location}
            type="text"
            name="storyLocation-input"
            onChange={this.handleInputChange}
            id="storyLocation-input"
            placeholder="Sword Coast, Northern"
          />
        </FormGroup>

        <FormGroup className="form-group">
          <Label for="genre-input">Genre</Label>
          <Input
            value={genre}
            type="text"
            name="genre-input"
            onChange={this.handleInputChange}
            id="genre-input"
            placeholder="Medievel Fantasy"
          />
        </FormGroup>

        <Button onClick={this.handleSubmit} color="success">
          Submit
        </Button>
      </Form>
    );
  }
}

export default CreateStorybookForm;

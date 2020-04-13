import React, { Component } from "react";
// Comment out to prevent warnings when needed they are here for easy access
import { Row } from "reactstrap";
import TextCard from "../../parts/TextCard";
import API from "../../../utils/API";
// import SweetAlert from 'react-bootstrap-sweetalert';

/* What I am building today: 
  -
*/

class Gallery extends Component {
  
  constructor(props) {
    super(props);

    this.state = {
      count: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    };
  }

  componentDidMount() {
    console.log("Mount state:", this.state);
  }

  componentDidUpdate() {
    console.log("Update state:", this.state);
  }

  // General handler for inputs thats value is to change the state
  // If state does not exsist it makes a state field with its name
  handleInputChange = event => {
    const { name, value } = event.target;
    this.setState({
      [name]: value
    });
  };

  render() {
    return (
      <Row className="pt-5">
        {this.state.count.length ? (
          <div className="p-1" style={styles.box}>
            {this.state.count.map(user => {
              return (
                <TextCard
                  className="m-2"
                  key={user._id}
                  subtitle={`Image card ${user}`}
                >
                  <img src="http://picsum.com/200" alt="" />
                </TextCard>
              );
            })}
          </div>
        ) : (
          // If nothing is in array display empty p tag
          <p></p>
        )}
      </Row>
    );
  }
}

const styles = {
  box: {
    backgroundColor: "blue",
    display: "flex",
    margin: "10px"
  }
};

export default Gallery;

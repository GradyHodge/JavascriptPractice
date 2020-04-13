import React, { Component } from "react";
import PropTypes from "prop-types";

export class TodoItem extends Component {
  render() {
    return (
      <div style={this.getStyle()}>
        <p>{this.props.todo.title}</p>
      </div>
    );
  }

  //PropTypes
TodoItem.propTypes = {
  todos: PropTypes.object.isRequired
}

const itemStyle = {
  backgroundColor: '#f4f4f4'
}

}

export default TodoItem;

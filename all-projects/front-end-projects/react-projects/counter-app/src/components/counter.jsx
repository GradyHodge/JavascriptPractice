import React, { Component } from "react";

class Counter extends Component { 
  state = {
    count: 0,
  };

  constructor() {
    super();
    this.handleIncrement = this.handleIncrement.bind(this);
  }

  handleIncrement = () => {
    console.log('Increment Clicked', this.state.count);
  }

  render() {
    return (
      <div>
        <span className={this.getBadgeClasses()}>{this.formatCount()}</span>
        <button 
        onClick={this.handleIncrement} className="btn btn-secondary btn-sm">Increment</button>
    );
  }

  
export default Counter;

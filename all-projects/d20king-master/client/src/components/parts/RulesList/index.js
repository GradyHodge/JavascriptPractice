import React from "react";
import { ListGroup, ListGroupItem } from "reactstrap";

const RulesList = () => {
  return (
    <ListGroup style={{ margin: "0 auto", width: "80%" }}>
      <ListGroupItem style={styles.groupItem}>
        Each side rolls a d20 to determine thier base chance. If a specific
        skill is used add modifier, otherwise use base value.
      </ListGroupItem>
      <ListGroupItem style={styles.groupItem}>
        Nat 20s are automatic critical success. In the case of both sides
        getting a nat 20 both get simultaneous critical success.
      </ListGroupItem>
      <ListGroupItem style={styles.groupItem}>
        Any value after modifier below 5 is a failure. Any value 3 or below is a
        fumble.
        <small>(Drop weapon/fall down)</small>
        Any nat 1 is an automatic fail and fumble.
      </ListGroupItem>
      <ListGroupItem style={styles.groupItem}>
        If character has 2hp or less all actions have -2 modifier and movement
        speed is half. A character with 1 hp cannot move until healed.
      </ListGroupItem>
      <ListGroupItem style={styles.groupItem}>
        If a character has 0 or below hp. The character is knocked out. Each
        round they can roll 15 to wake up with 1hp. Once awake need a 10 to get
        up with 2hp.
      </ListGroupItem>
      <ListGroupItem style={styles.groupItem}>
        If you use a cantrip it has no modifier value. So it will only use a
        straight d20.
      </ListGroupItem>
    </ListGroup>
  );
};

const styles = {
  groupItem: {
    backgroundColor: "lightgrey",
    fontSize: "large",
  },
};

export default RulesList;

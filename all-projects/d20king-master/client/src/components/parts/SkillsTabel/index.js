import React from "react";
import { Table } from "reactstrap";
import "./index.css";

const SkillsTabel = () => {
  return (
    <Table id="skillsTabel" dark bordered striped>
      <thead>
        <tr>
          <th scope="col">Name</th>
          <th scope="col">Bonus 1</th>
          <th scope="col">Bonus 2</th>
          <th scope="col">Bonus 3</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th scope="row">Strength</th>
          <td>Physical Attack Damage</td>
          <td>Physical Attack Chance</td>
          <td>Athletics</td>
        </tr>
        <tr>
          <th scope="row">Wisdom</th>
          <td>Spell Attack Damage</td>
          <td>Spell Attack Chance</td>
          <td>Perception</td>
        </tr>
        <tr>
          <th scope="row">Dexterity</th>
          <td>Initiave</td>
          <td>Stealth</td>
          <td>Dodge Attack</td>
        </tr>
        <tr>
          <th scope="row">Charisma</th>
          <td>Magic Items</td>
          <td>Persuasion</td>
          <td>Resist Charms</td>
        </tr>
        <tr>
          <th scope="row">Constution</th>
          <td>Health</td>
          <td>Diesease/Poision Resist</td>
          <td>Attack Resist</td>
        </tr>
      </tbody>
    </Table>
  );
};

export default SkillsTabel;

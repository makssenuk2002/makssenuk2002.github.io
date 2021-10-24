 import React, { Component } from 'react';

import ItemList from '../item-list/item-list';
import ItemDetails from '../item-details/item-details';
import ErrorIndicator from '../error-indicator/error-indicator';

import './people-page.css';
import SwapiService from "../../services/swapi-service";
import Row from "../Row";
 import ErrorBoundry from "../ErrorBoundry";



export default class PeoplePage extends Component {
  swapiServise = new SwapiService()
  state = {
    selectedPerson: 3,
   };



  onPersonSelected = (selectedPerson) => {
    this.setState({ selectedPerson });
  };

  render() {

    if (this.state.hasError) {
      return <ErrorIndicator />;
    }
    const itemList = (
        <ItemList
            onItemSelected={this.onPersonSelected}
            getData ={this.swapiServise.getAllPeople}>
          {(i) =>(
              `${i.name} (${i.birthYear})`
          )}
          </ItemList>
    );
    const personDetails = (
        <ErrorBoundry>
          <ItemDetails personId={this.state.selectedPerson} />

        </ErrorBoundry>

    )
    return (
          <Row left={itemList} right={ personDetails}/>
    );
  }
}

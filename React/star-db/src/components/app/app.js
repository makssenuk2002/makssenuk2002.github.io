 import React, { Component } from 'react';

import Header from '../header';
import RandomPlanet from '../random-planet';
import ErrorButton from '../error-button';
import ErrorIndicator from '../error-indicator';
import PeoplePage from '../people-page';

import './app.css';
import ItemList from "../item-list";
import ItemDetails from "../item-details";
import SwapiService from "../../services/swapi-service";
 import Row from "../Row";

export default class App extends Component {
    swapiServise = new SwapiService()

  state = {
    showRandomPlanet: true,
    hasError: false
  };

  toggleRandomPlanet = () => {
    this.setState((state) => {
      return {
        showRandomPlanet: !state.showRandomPlanet
      }
    });
  };


  componentDidCatch() {
    this.setState({ hasError: true });
  }

  render() {

    if (this.state.hasError) {
      return <ErrorIndicator />
    }

    const planet = this.state.showRandomPlanet ?
      <RandomPlanet/> :
      null;
    const {getPerson,getStarship,getPersonImage,getStarshipImage} = this.swapiServise
    const personDetails = (
        <ItemDetails
            itemId={5}
            getData={getPerson}
            getImageUrl={getPersonImage}

        />
    )
    const starshipDetails = (
        <ItemDetails
            itemId={5}
            getData={getStarship}
            getImageUrl={getStarshipImage}

        />
    )
    return (
      <div className="stardb-app">
        <Header />
        {/*{ planet }*/}

        <div className="row mb2 button-row">
          {/*<button*/}
          {/*  className="toggle-planet btn btn-warning btn-lg"*/}
          {/*  onClick={this.toggleRandomPlanet}>*/}
          {/*  Toggle Random Planet*/}
          {/*</button>*/}
            <Row
                left={personDetails}
                right={starshipDetails}
            />
          <ErrorButton />
        </div>




      </div>
    );
  }
}

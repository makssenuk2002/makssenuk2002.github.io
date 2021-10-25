import React from "react";
import ItemList from "../item-list/item-list";
import {withData} from '../hoc-helper'
import SwapiService from "../../services/swapi-service";

const  swapiService = new SwapiService()

const  {
    getAllPeople,
    getAllPlanets,
    getAllStarships
}= swapiService

const withChildFunction = (Wrapped , fn) =>{
        return (props) => {
            return(
                <Wrapped {...props}>
                    {fn}
                </Wrapped>
            )
        }
}
const renderName = ({name})=> <samp>{name}</samp>
const renderModelAndName = ({name,model}) => <span>{name} ( {model} )</span>

const PersonList = withData(withChildFunction(ItemList,renderName),getAllPeople)
const PlanetList = withData(withChildFunction(ItemList,renderName),getAllPlanets)
const StashiprList = withData(withChildFunction(ItemList,renderModelAndName),getAllStarships)

export {
    PersonList,
    PlanetList,
    StashiprList
}
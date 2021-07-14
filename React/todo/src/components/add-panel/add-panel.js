import React,{Component} from 'react';
import './add-panel.css'


export default class onItemAdded extends Component {
    state ={
        label: ''
    }

    onLabelChange = (e) => {
        this.setState({
            label: e.target.value
        })
    }

    onSubmit = (e) =>{
        e.preventDefault();
        this.props.onItemAdded(this.state.label)
        this.setState({
            label: ''
          })
    }
    render(){
        return (
            
            <form className='item-add-form d-flex'
                    onSubmit={this.onSubmit}>
                <input type="text"
                    className="form-control"
                    onChange={this.onLabelChange}
                    placeholder="What needs to be done"/>



                <button type="button" 
                    className=" btn btn-info  addBtn">
                    Add Item
                </button>
            </form>


            

        )
    }
}

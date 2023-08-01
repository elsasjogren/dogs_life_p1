import React from 'react'
import DogDetails from './DogDetails';
import Row from 'react-bootstrap/Row';
import {getAllDogs} from '../services/dog-service';
import { useState, useEffect } from 'react';

const AllDogs = () => {
    const [dogs, setDogs] = useState([]);

    useEffect(()=>{
        getDogsFromAPI();}, 
        []
    );
    const getDogsFromAPI = ()=>{
        getAllDogs().then(res => {
            console.log(res);
            setDogs(res.data);
        })
        .catch(err => {
            setDogs([]);
            console.log(err);
        })
    }
    
    return (
    <Row>
        {dogs.map(dog => (
            <div className='container' key={dog.id}>
                <DogDetails info={dog} key={dog.id.toString()} />
            </div>
        ))}
    </Row>
  )
}

export default AllDogs
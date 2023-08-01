import React from 'react'
import Card from 'react-bootstrap/Card'

const DogDetails = (props) => {
  return (<Card>
            <Card.Body>
                <p id="id">Dog ID: {props.info.id}</p>
                <p id="name">Dog Name: {props.info.name}</p>
                <p id="age">Dog Age: {props.info.age}</p>
                <a id="owner">Owner Information</a>
            </Card.Body>
        </Card>
  )
}

export default DogDetails
import React from 'react';
import Form from './component/Form';
import List from './component/List';
import MayorForm from './component/MayorForm';
import { StoreProvider } from './component/Store';

function App() {
  return <StoreProvider>
    <div className= 'container'>
    <h3>To-Do List</h3>
    <Form />
    <List /> 
    <h3>Master List</h3>
    <MayorForm />
    </div>
  </StoreProvider>
}

export default App;

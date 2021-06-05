import React from 'react';
import Form from './component/Form';
import List from './component/List';
import { StoreProvider } from './component/Store';


function App() {
  return <StoreProvider>
    <h3>To-Do List</h3>
    <Form />
    <List />
  </StoreProvider>
}

export default App;

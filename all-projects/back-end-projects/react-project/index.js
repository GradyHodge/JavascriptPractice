import React from 'react';
import ReactDom from 'react-dom';

var hW1 = React.createElement('h3', null,
'Hello Worlds')
var hW2 = React.createElement('h3', null, 'Nice to Meet You')

var div1 = React.createElement('div', null, hW1, hW2);

ReactDOM.render(
    div1,
    document.getElementById('app')
)
/* Graphs: Breadth-first search */

function bfs(graph, root) {
	
	var nodeArray = {};
  
  for (var i = 0; i < graph.length; i++) {
    // length of graph is five, so putting Infinity to every index
		// which means every node's distance from root is infinity
	nodeArray[i] = Infinity;
  }
  //root node length from itself is 0
  nodeArray[root] = 0; 
  
  var queue = [root]; 
  var current; 

  while (queue.length != 0) {
    //shifting the element of queue to current,
//	and queue will be empty
	current = queue.shift();
    console.log(current);
    console.log(queue);
    
	// taking out the graph value and placing it
		//into array for further iterations
    var connected = graph[current];
    //console.log(graph[current]);
	
	// EMpty array which will hold the neighboring connecting index
    var neighborIndex = []; 
	
	// get the index of 1 from connected array
    var index = connected.indexOf(1); 
    //console.log("index="+index);
    
    while (index != -1) {
      neighborIndex.push(index);
      //console.log(neighborIndex.push(index));
	  
	  // get the next index of 1 from current Connected Array
      index = connected.indexOf(1, index + 1);
      //console.log("index_="+index);
    }
    
    //console.log("nodeArray = "+nodeArray);
    console.log("neighborIndex = "+neighborIndex.length);
    
    for (var x = 0; x < neighborIndex.length; x++) {
      if (nodeArray[neighborIndex[x]] == Infinity) {
		  // Incrementing the distance from the root to the particular node
        nodeArray[neighborIndex[x]] = nodeArray[current] + 1;
        queue.push(neighborIndex[x]); 
      }
    }
  }
  return nodeArray;  
};
// graph
var graphBFS = [
	  [0, 1, 1, 1, 0],
	  [0, 0, 1, 0, 0],
	  [1, 1, 0, 0, 0],
	  [0, 0, 0, 1, 0],
	  [0, 1, 0, 0, 0]
];
var root = 1;
console.log(bfs(graphBFS, root));
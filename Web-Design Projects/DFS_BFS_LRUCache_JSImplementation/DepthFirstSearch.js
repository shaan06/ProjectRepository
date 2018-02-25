function dfs(graph,root){
    //  Size of graph_DFS is five so we marked every node initially as not visited
    visited = [false, false, false, false, false];
    // Root defined as 1 and pushed into stack
	stack = [root];
	// Make root as visited
	visited[root] =true;
    // popping the stack into node
	node = stack.pop(stack.length-1);
	console.log(node);
	// 
	while(true)
	{
		// run the loop till length of visited array which is 5
		for(var i=0; i<visited.length;i++)
		{
			// if value of graphDFS is 1 and the node is 
			//unvisited then go in and marked that node to visited
			if(graph_DFS[node][i] == 1 && !visited[i]){
			visited[i]=true;
			// then we need to put that i in stack.
			stack.push(i);
		}
	}

  if(stack.length==0){
	break;
  }
  else{
    node=stack.pop(stack.length-1)
    console.log(node);
  }
}
	
}
// graph
var graph_DFS =
	[
	  [0, 1, 1, 1, 0],
	  [0, 0, 1, 0, 0],
	  [1, 1, 0, 0, 0],
	  [0, 0, 0, 1, 0],
	  [0, 1, 0, 0, 0]
	]
var root = 1;
console.log(dfs(graph_DFS,root));


	


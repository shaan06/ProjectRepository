/*
   * @constructor to declare the capacity of the queue
   * Generate a queue array
   * and keyarray for the keys of the queue
   */
  var LRUCache = function(capacity) {
      this.capacity = capacity;
      this.KeyArray = new Set();
      this.Queue = []; 
  };
  
 /*
  * @param {number} key
  * @returns {number}
  * takes key and value as the parameter
  * First we try to locate a node with the KEY, 
  * if we found a node, we just change the value 
  * of that node and move the node to 
  * head(means it is most recently used). If we cannot find a node, 
  * we will create a new node with (key,val) and attach it to the head. 
  * If the size of cache exceeds the capacity, 
  * we need to REMOVE the LAST node(last recently used).
  */
 
 LRUCache.prototype.set = function(key, value) {
     /*
      * try to locate a node with the KEY, 
  	  * if we found a node, we just change the value 
 	  * of that node and move the node to 
	  * head(means it is most recently used)
      */
     if(this.KeyArray.has(key)){
         var index = -1;
         for(var i = 0; i < this.Queue.length; i++){
             if(this.Queue[i].key === key){
                 index = i;
                 break;
             }
         }
         
         this.Queue = this.Queue.slice(0,index).concat(this.Queue.slice(index + 1));
     }else{
         this.KeyArray.add(key);
     }
     /*
      * create a new node with (key,val) and attach it to the head.
      */
     this.Queue.unshift({key : key, value : value}); 
 
     if(this.Queue.length > this.capacity){
         var pop = this.Queue.pop();
         /*
          * REMOVE the LAST node(last recently used).
          */
         this.KeyArray.delete(pop.key);
     }
 };
 /*
  *  Get the value (will always be positive) of the key 
  * if the key exists in the cache, 
  * otherwise return -1.
  */
 LRUCache.prototype.get = function(key) {
     if(this.KeyArray.has(key)){
         for(var i = 0; i < this.Queue.length; i++){
             if(this.Queue[i].key === key){
                 var value = this.Queue[i].value;
                 this.Queue = this.Queue.slice(0,i).concat(this.Queue.slice(i + 1));
                 this.Queue.unshift({key : key, value : value}); 
                 return value;
             }
         }
     }
     return -1;
};



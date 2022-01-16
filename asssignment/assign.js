const input_array1=[1,2,3,4];
const output_array1=[];
const output_array2=[];
const output_array3=[];
let sum=0;

const callbackMap = (x)=>{
  return x**2;
}

const callbackFilter = (x)=>{
  if(x%2==0){
    return x;
  }
}
const callbackReduce = (x,sum)=>{
  sum=sum+x;
  return sum;
}
function map(arr,n,i){
    if(i==n){
        return;
    }
    output_array1[i]=callbackMap(arr[i]);
    i++;


    map(arr,n,i);
}
function fil(arr,n,i) {
  if(i==n){
    return;
  }
  let ans=callbackFilter(arr[i]);
  if(ans!=undefined){
    output_array2.push(ans);
  }
  i++;

  fil(arr,n,i);
}
function fo(arr,n,i) {
  if(i==n){
      return;
  }
  output_array3.push(arr[i])
  i++;

  fo(arr,n,i);

}
function reduce(arr,n,i) {
  if(i==n){
      return;
  }
  sum=callbackReduce(arr[i],sum);
  i++;

  reduce(arr,n,i);

}

function makeMap(input_array, callback){
  n=input_array.length;
  map( input_array,n,0);
  return output_array1;
}
function filter(input_array,callbackFilter) {
    n=input_array.length;
    fil(input_array,n,0);
    return output_array2;
}
function foreach(input_array) {
    n=input_array.length;
    fo(input_array,n,0);
    return output_array3;

}
function reduceSum(input_array) {
    n=input_array.length;
    reduce(input_array,n,0);
    return sum;

}
console.log(makeMap(input_array1,callbackMap));
console.log(filter(input_array1,callbackFilter));
console.log(foreach(input_array1));
console.log(reduceSum(input_array1,callbackReduce));

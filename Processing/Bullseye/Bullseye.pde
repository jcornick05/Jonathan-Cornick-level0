void setup(){
    size(500,500);
  for(int x = 400; x > 0; x -=50){
  if (x%2 == 0){
   fill(255,255,255);
  }
  else{
  fill(255,0,0); 
  }
  ellipse(250,250,x,x);

  }  
}
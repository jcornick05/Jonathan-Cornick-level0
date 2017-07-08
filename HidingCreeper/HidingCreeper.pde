PImage creeper;
PImage minecraft;

int X=300;
int Y=400;

void setup(){
  creeper=loadImage("creeper.png");
  
  size(700,500);
  
  minecraft = loadImage("download.jpg");
  minecraft.resize(700,500);
  background(minecraft);
  
  
}

void draw(){
  background(minecraft);
  
  image(creeper, X, Y);
  creeper.resize(10,10);

if(mousePressed&mouseX=>300&mouseY=>400){
  ellipse(mouseX,mouseY);
  fill(255,1,0);

}

}


public class Cell {
int n;
int e;
int s;
int w;
int order;
boolean startcell;

public Cell(int NORTH, int EAST, int SOUTH, int WEST, boolean st, int o){
	this.n = NORTH;
	this.e = EAST;
	this.s = SOUTH;
	this.w = WEST;
	this.order = o;
	this.startcell = st;
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public int getE() {
	return e;
}

public void setE(int e) {
	this.e = e;
}

public int getS() {
	return s;
}

public void setS(int s) {
	this.s = s;
}

public int getW() {
	return w;
}

public void setW(int w) {
	this.w = w;
}
public boolean isWest() {
	if(w==1){
		return true;
	} else {
		return false;
	}
}
public boolean isEast() {
	if(e==1){
		return true;
	} else {
		return false;
	}
}public boolean isNorth() {
	if(n==1){
		return true;
	} else {
		return false;
	}
}
public boolean isSouth() {
	if(s==1){
		return true;
	} else {
		return false;
	}
}
public boolean isStartCell() {
	return startcell;
}
public int getWalls() {
	return w+n+s+e;
}
}

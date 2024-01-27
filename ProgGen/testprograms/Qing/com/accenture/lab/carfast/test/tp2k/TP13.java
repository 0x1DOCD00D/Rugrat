package com.accenture.lab.carfast.test.tp2k;


public class TP13 extends TP8 {


public static int TP13method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 var4 = (int)((var0*var4)+(var3%(int)(17)));
}
if( ((var2-var4)==((var1/(int)(36))+(var4-(int)(0))))){
if( ((var0/(int)(16))>=(var4/(int)(2)))){
if( ((var2+var1)<=((var3-var1)*(var0+var3)))){
var2 = TP13method2(var1,var0,var3,var2,var2,var1,var2,var4,var2);
}
}
}
for(int i = 0; i < 3; i++){
 if( ((var3-(int)(10))<(var1/(int)(27)))){
var0 = (int)((var1*var4)*(var3*var0));
}
}
return (int)var3;

}

public int TP8method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 for(int i = 0; i < 4; i++){
 if( ((var0*(int)(30))!=(var6*var4))){
if( ((var2%(int)(22))!=(var5+(int)(41)))){
var3 = (int)(15);
}
}
}
for(int i = 0; i < 0; i++){
 if( ((var6-var2)<=(var4*var9))){
var3 = TP8method2(var1,var6,var1,var0,var8,var3,var7,var3,var9,var1,var6);
}
}
if( (((var4/(int)(14))*((var8/(int)(45))*(var9-var0)))!=(var2*var5))){
if( (((var4+var9)/(int)(6))<(var2*var6))){
System.out.println("TP13 - TP8method0- LineInMethod: 15");
}
}
return (int)var7;

}

public static int TP13method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 1; i++){
 if( ((var3+var2)==(var7-var3))){
var7 = (int)(23);
}
}
for(int i = 0; i < 2; i++){
 if( ((var4*(int)(43))==(var4*(int)(41)))){
if( ((var2*var4)==(var6*var7))){
var6 = (int)((var6%(int)(1))-(var8-var4));
}
}
}
for(int i = 0; i < 2; i++){
 var8 = (int)(((var1/(int)(34))*((var5+var0)%(int)(3)))*((var0/(int)(35))*(var3-var0)));
}
return (int)var8;

}

public int TP8method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 for(int i = 0; i < 0; i++){
 System.out.println("TP13 - TP8method2- LineInMethod: 2");
}
switch((var2-var3)){
case 0:
System.out.println("TP13 - TP8method2- LineInMethod: 5");
 break;
case 1:
var5 = (int)((var5*var8)+(var6+var3));
 break;
default :
var8 = (int)((var7+var5)+(((var10*var3)*(var6*var3))/(int)(24)));
}
return (int)var6;

}


public static void main(String args[]){
TP13 obj = new TP13();
TP13method0((int)(21),(int)(27),(int)(24),(int)(31),(int)(27));
obj.TP8method0((int)(45),(int)(42),(int)(39),(int)(49),(int)(41),(int)(10),(int)(33),(int)(1),(int)(37),(int)(49));
TP13method2((int)(38),(int)(47),(int)(48),(int)(6),(int)(49),(int)(33),(int)(46),(int)(0),(int)(0));
obj.TP8method2((int)(15),(int)(47),(int)(25),(int)(24),(int)(30),(int)(2),(int)(47),(int)(34),(int)(11),(int)(20),(int)(46));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP13 obj = new TP13();
TP13method0(i3,i2,i11,i10,i13);
obj.TP8method0(i12,i7,i14,i5,i8,i3,i1,i2,i11,i9);
TP13method2(i4,i0,i5,i1,i3,i10,i12,i9,i7);
obj.TP8method2(i11,i13,i3,i14,i8,i2,i4,i1,i10,i7,i0);
}

}
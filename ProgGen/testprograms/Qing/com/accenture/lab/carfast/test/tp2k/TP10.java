package com.accenture.lab.carfast.test.tp2k;


public class TP10 extends TP18 implements TPInterface0 {


public int TPInterface0Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 2; i++){
 if( (((var1*var3)-(var4*var1))>(var6%(int)(45)))){
System.out.println("TP10 - TPInterface0Method0- LineInMethod: 4");
}
}
if( ((var2/(int)(27))!=(var3-var7))){
var5 = (int)(40);
}
if( ((var0+var6)==(var5+var6))){
System.out.println("TP10 - TPInterface0Method0- LineInMethod: 11");
}
return (int)var5;

}

public static int TP10method0(int var0, int var1, int var2, int var3){
 if( ((var2%(int)(1))>(var1+var2))){
if( ((var1-var2)<=(var2*var3))){
var2 = (int)((((var3-var2)*(var0*var1))*(var2+(int)(12)))/(int)(37));
}
}
if(((var1-(int)(1))>=(var0-var1))){
var2 = (int)(var3-var2);
}
else{
 var2 = TP18method2(var2,var2,var2,var3,var2);
}
return (int)var1;

}

public static int TP18method0(int var0, int var1, int var2, int var3){
 if(((var1-var2)>((var0%(int)(30))*((var3*var2)+(var0/(int)(5)))))){
System.out.println("TP10 - TP18method0- LineInMethod: 4");
}
else{
 var0 = (int)(((var1*var3)-(var3%(int)(9)))%(int)(15));
}
if(((var2*(int)(25))<(var2-var0))){
var1 = TP18method2(var0,var3,var2,var0,var1);
}
else{
 System.out.println("TP10 - TP18method0- LineInMethod: 14");
}
return (int)var3;

}

public int TP10method2(int var0, int var1, int var2, int var3, int var4){
 if( ((var1%(int)(37))!=(var2-var0))){
if( ((var0*var1)>((var0/(int)(42))+(var3+var1)))){
if( ((var2*var4)>=(var1-var0))){
var1 = (int)((var4%(int)(2))-(var4*var3));
}
}
}
if(((var4-var1)<=(var1-var4))){
System.out.println("TP10 - TP10method2- LineInMethod: 11");
}
else{
 System.out.println("TP10 - TP10method2- LineInMethod: 14");
}
return (int)var2;

}

public static int TP18method2(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 if( (((var4*(int)(47))-(var4*var0))>(var3/(int)(7)))){
System.out.println("TP10 - TP18method2- LineInMethod: 4");
}
}
switch(((var0+var4)-((var1/(int)(12))*(var0*(int)(20))))){
case 0:
System.out.println("TP10 - TP18method2- LineInMethod: 9");
 break;
case 1:
var2 = (int)(22);
 break;
case 2:
var4 = (int)(20);
 break;
default :
System.out.println("TP10 - TP18method2- LineInMethod: 20");
}
return (int)var4;

}


public static void main(String args[]){
TP10 obj = new TP10();
obj.TPInterface0Method0((int)(28),(int)(19),(int)(19),(int)(11),(int)(21),(int)(38),(int)(30),(int)(32));
TP10method0((int)(10),(int)(12),(int)(49),(int)(17));
TP18method0((int)(30),(int)(45),(int)(27),(int)(49));
obj.TP10method2((int)(35),(int)(36),(int)(38),(int)(47),(int)(25));
TP18method2((int)(20),(int)(32),(int)(7),(int)(25),(int)(12));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP10 obj = new TP10();
obj.TPInterface0Method0(i8,i2,i7,i3,i14,i9,i0,i12);
TP10method0(i13,i0,i2,i6);
TP18method0(i8,i14,i5,i4);
obj.TP10method2(i4,i8,i5,i14,i9);
TP18method2(i4,i9,i14,i5,i13);
}

}
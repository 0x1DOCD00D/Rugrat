package com.accenture.lab.carfast.test.tp2k;


public class TP2 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 for(int i = 0; i < 0; i++){
 if( ((var8/(int)(19))==(var7+var6))){
if( (((var1+var7)%(int)(15))==(var4/(int)(20)))){
if( ((var0*(int)(14))!=(var9*var5))){
var7 = (int)(((((var9+(int)(47))/(int)(44))%(int)(34))/(int)(39))*((var6-var5)*(var8/(int)(6))));
}
}
}
}
if( (((var7*var2)*(var4-var5))<=((var1*var0)-(var1*(int)(11))))){
TP2method2(var6,var6,var6,var4,var6,var1,var4,var9,var7,var5,var8);}
return (int)var2;

}

public int TP2method0(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 4; i++){
 if( ((var2+(int)(39))!=(var0*var1))){
if( ((var3%(int)(20))>=(var3/(int)(16)))){
if( ((((var0-var3)>(var1+var3))&&((var1%(int)(6))==(var1+var3)))&&((((var1+(int)(35))/(int)(2))-(var0*var3))>=((var3-var1)%(int)(1))))){
System.out.println("TP2 - TP2method0- LineInMethod: 8");
}
}
}
}
return (int)var2;

}

public int TP2method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 switch((var2/(int)(7))){
case 0:
TP2method2(var5,var7,var2,var2,var4,var7,var6,var9,var5,var2,var8); break;
case 1:
var2 = TP2method2(var5,var7,var9,var2,var5,var7,var7,var2,var6,var3,var2);
 break;
case 2:
System.out.println("TP2 - TP2method1- LineInMethod: 8");
 break;
default :
var1 = (int)((var3+var7)+(var5%(int)(49)));
}
return (int)var9;

}

public static int TP2method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( (((var0*var4)>((var7/(int)(26))+(var7+var6)))&&((var4-var10)>(var3*var2)))){
if( ((var6/(int)(44))>(var9/(int)(29)))){
var7 = (int)(var5*var9);
}
}
for(int i = 0; i < 4; i++){
 if( (((var9-var2)==((var8/(int)(47))+(var8%(int)(44))))&&(((var8+(int)(48))==(var10/(int)(5)))&&((var3%(int)(42))==(var9/(int)(45)))))){
if( (((var8+var10)-((var8%(int)(39))*(var7-var3)))>=(var3-var6))){
var0 = (int)(43);
}
}
}
return (int)var8;

}

public int TP2method3(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 1; i++){
 if( ((var2*var1)>=(var3%(int)(16)))){
if( ((var0+var3)>(var2+var1))){
if( ((var1-var2)!=(var2*var3))){
var0 = (int)((var1+var2)*(var3/(int)(42)));
}
}
}
}
if( ((var3%(int)(14))>=(var2*(int)(19)))){
System.out.println("TP2 - TP2method3- LineInMethod: 11");
}
return (int)var1;

}


public static void main(String args[]){
TP2 obj = new TP2();
obj.TPInterface1Method0((int)(17),(int)(20),(int)(9),(int)(37),(int)(6),(int)(42),(int)(19),(int)(37),(int)(23),(int)(6));
obj.TP2method0((int)(46),(int)(6),(int)(25),(int)(5));
obj.TP2method1((int)(32),(int)(3),(int)(45),(int)(30),(int)(13),(int)(9),(int)(14),(int)(9),(int)(21),(int)(25));
TP2method2((int)(23),(int)(9),(int)(15),(int)(27),(int)(7),(int)(41),(int)(37),(int)(19),(int)(41),(int)(33),(int)(8));
obj.TP2method3((int)(1),(int)(23),(int)(43),(int)(29));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP2 obj = new TP2();
obj.TPInterface1Method0(i3,i8,i5,i4,i10,i9,i2,i14,i11,i7);
obj.TP2method0(i8,i5,i4,i9);
obj.TP2method1(i4,i1,i7,i6,i0,i10,i2,i12,i3,i13);
TP2method2(i8,i9,i4,i0,i2,i10,i5,i12,i6,i14,i1);
obj.TP2method3(i2,i4,i14,i12);
}

}
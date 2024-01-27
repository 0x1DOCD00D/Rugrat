package com.accenture.lab.carfast.test.tp6k;


public class TP26 extends TP14 implements TPInterface2 {


public int TPInterface2Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var4%(int)(30))){
case 0:
var4 = (int)((var11/(int)(2))/(int)(35));
 break;
case 1:
System.out.println("TP26 - TPInterface2Method0- LineInMethod: 5");
 break;
case 2:
System.out.println("TP26 - TPInterface2Method0- LineInMethod: 8");
 break;
case 3:
var2 = (int)(var4%(int)(1));
 break;
case 4:
var3 = TP26method1(var10,var2,var3,var12,var10);
 break;
default :
var3 = (int)(var3/(int)(22));
}
return (int)var10;

}

public int TPInterface2Method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 switch((var9-(int)(41))){
case 0:
System.out.println("TP26 - TPInterface2Method1- LineInMethod: 2");
 break;
case 1:
var10 = (int)(42);
 break;
case 2:
TP26method3(var10,var2,var13,var8,var0); break;
default :
System.out.println("TP26 - TPInterface2Method1- LineInMethod: 12");
}
switch((var12+(int)(24))){
case 0:
TP14method2(var5,var11,var9,var7,var7); break;
case 1:
var6 = TP14method4(var6,var11,var8,var11,var0,var13);
 break;
case 2:
var13 = (int)((var9-var7)%(int)(30));
 break;
default :
System.out.println("TP26 - TPInterface2Method1- LineInMethod: 24");
}
return (int)var3;

}

public int TP26method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 if((((var1*var9)<=(var13%(int)(25)))||((var9*var11)>=(var0-var5)))){
System.out.println("TP26 - TP26method0- LineInMethod: 4");
}
else{
 var11 = (int)((var0-var12)+(var4*var3));
}
if(((var6-var8)==(var9+var8))){
var8 = (int)((var7+var12)*(var8+var5));
}
else{
 TP14method4(var2,var7,var9,var0,var6,var7);}
if( ((var3*var1)<=((var5%(int)(4))*((var7*var4)+(var8+(int)(2)))))){
System.out.println("TP26 - TP26method0- LineInMethod: 15");
}
return (int)var5;

}

public int TP26method1(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 5; i++){
 if( (((var1%(int)(15))<(var3%(int)(48)))&&((((var0*var2)/(int)(3))!=(var2/(int)(48)))&&((var1+var4)>=(var4/(int)(3)))))){
if( (((var4+(int)(2))*(var3/(int)(35)))!=(var4*(int)(10)))){
if( (((var4+(int)(11))>(var3+var4))&&((var4/(int)(26))==(var2*var0)))){
if( (((var0+(int)(44))!=((var4-var2)+((var0+var1)+(var2+var0))))||(((var3-var4)%(int)(13))<((var3+var1)%(int)(26))))){
var3 = (int)(28);
}
}
}
}
}
if( ((var1*var4)!=(var2*var0))){
if( ((var0/(int)(46))>(var1*var3))){
TP14method2(var3,var0,var2,var1,var3);}
}
return (int)var0;

}

public static int TP14method4(int var0, int var1, int var2, int var3, int var4, int var5){
 if(((var4+var0)<(((var4-var2)-(var5/(int)(36)))-(var4+var3)))){
System.out.println("TP26 - TP14method4- LineInMethod: 4");
}
else{
 System.out.println("TP26 - TP14method4- LineInMethod: 6");
}
if(((var3+var4)!=(var1-var5))){
var0 = (int)(var3/(int)(48));
}
else{
 var5 = (int)(49);
}
for(int i = 0; i < 2; i++){
 if( ((var5+var0)<(var1/(int)(49)))){
if( (((var5%(int)(21))+(var0/(int)(29)))>=(var5/(int)(1)))){
var1 = (int)(14);
}
}
}
return (int)var0;

}

public int TP26method3(int var0, int var1, int var2, int var3, int var4){
 if( ((var4*var2)<((var2%(int)(37))*((var0-var2)+(var0+var3))))){
if( (((var2-var0)>=(var1*var0))&&((var3+var1)!=(var4-var2)))){
System.out.println("TP26 - TP26method3- LineInMethod: 4");
}
}
if( (((var1-var0)+(var0/(int)(14)))>((var4-(int)(29))+(var3+var1)))){
if( ((var4*(int)(20))<(var0+(int)(20)))){
if( ((var4*var3)>(var3+var0))){
System.out.println("TP26 - TP26method3- LineInMethod: 13");
}
}
}
return (int)var1;

}

public static int TP14method2(int var0, int var1, int var2, int var3, int var4){
 if( (((var2*var1)*(var3%(int)(22)))<(var0/(int)(38)))){
var1 = TP14method4(var3,var3,var4,var0,var0,var3);
}
if( ((var2%(int)(9))!=(var3%(int)(23)))){
if( ((var1*var4)<(var4-var1))){
var1 = (int)((var4*var2)%(int)(46));
}
}
if(((var1*var2)!=(var1+var0))){
TP14method4(var0,var0,var0,var2,var4,var3);}
else{
 System.out.println("TP26 - TP14method2- LineInMethod: 13");
}
return (int)var2;

}


public static void main(String args[]){
TP26 obj = new TP26();
obj.TPInterface2Method0((int)(20),(int)(12),(int)(39),(int)(0),(int)(22),(int)(9),(int)(36),(int)(28),(int)(28),(int)(36),(int)(34),(int)(30),(int)(16));
obj.TPInterface2Method1((int)(18),(int)(6),(int)(29),(int)(48),(int)(16),(int)(25),(int)(7),(int)(31),(int)(11),(int)(29),(int)(15),(int)(25),(int)(47),(int)(26));
obj.TP26method0((int)(18),(int)(17),(int)(28),(int)(41),(int)(13),(int)(41),(int)(41),(int)(18),(int)(43),(int)(29),(int)(12),(int)(34),(int)(29),(int)(37));
obj.TP26method1((int)(43),(int)(6),(int)(36),(int)(7),(int)(45));
TP14method4((int)(16),(int)(2),(int)(0),(int)(20),(int)(22),(int)(13));
obj.TP26method3((int)(27),(int)(22),(int)(13),(int)(14),(int)(0));
TP14method2((int)(25),(int)(24),(int)(24),(int)(33),(int)(29));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP26 obj = new TP26();
obj.TPInterface2Method0(i9,i13,i4,i2,i6,i12,i14,i0,i1,i7,i11,i5,i8);
obj.TPInterface2Method1(i10,i9,i14,i0,i4,i5,i12,i13,i1,i6,i11,i3,i2,i8);
obj.TP26method0(i8,i4,i3,i7,i1,i0,i5,i10,i13,i9,i2,i6,i14,i11);
obj.TP26method1(i4,i6,i10,i7,i14);
TP14method4(i10,i6,i14,i2,i12,i4);
obj.TP26method3(i10,i12,i11,i9,i2);
TP14method2(i9,i5,i10,i13,i8);
}

}
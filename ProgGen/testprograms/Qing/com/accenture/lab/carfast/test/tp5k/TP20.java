package com.accenture.lab.carfast.test.tp5k;


public class TP20 {


public static int TP20method0(int var0, int var1, int var2, int var3, int var4){
 if(((((var4*var1)*((var0+var2)*(var2-var1)))+(var1-var2))>=(((var3*(int)(71))+(var4-var0))*((var3+(int)(10))*(var0*var2))))){
System.out.println("TP20 - TP20method0- LineInMethod: 4");
}
else{
 var1 = (int)((var2-var1)+(var1*var2));
}
switch((var0%(int)(56))){
case 0:
TP20method3(var1,var2,var1,var4,var1); break;
case 1:
System.out.println("TP20 - TP20method0- LineInMethod: 14");
 break;
case 2:
System.out.println("TP20 - TP20method0- LineInMethod: 20");
 break;
case 3:
System.out.println("TP20 - TP20method0- LineInMethod: 27");
 break;
case 4:
System.out.println("TP20 - TP20method0- LineInMethod: 32");
 break;
case 5:
TP20method3(var1,var3,var0,var1,var0); break;
case 6:
System.out.println("TP20 - TP20method0- LineInMethod: 41");
 break;
default :
var0 = (int)(var4*var3);
}
return (int)var1;

}

public static int TP20method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if(((var7*var4)<(((var6*var1)/(int)(67))*(var1+var2)))){
var0 = (int)(var0+var3);
}
else{
 System.out.println("TP20 - TP20method1- LineInMethod: 5");
}
for(int i = 0; i < 1; i++){
 if( ((var7*var5)!=(var2+var1))){
System.out.println("TP20 - TP20method1- LineInMethod: 13");
}
}
if( ((var0-var1)<(var5/(int)(38)))){
if( ((var9+var6)>=(var2-(int)(28)))){
if( (((var10%(int)(52))+(var0-var2))==(var1*var7))){
if( ((var3+var1)==(var1*var2))){
if( ((var7*var2)<(var7/(int)(63)))){
if( ((var6-var5)>(var1-var4))){
var9 = TP20method3(var8,var7,var3,var9,var0);
}
}
}
}
}
}
return (int)var5;

}

public int TP20method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((var12*var1)<((var7+var3)+(var0%(int)(38))))){
System.out.println("TP20 - TP20method2- LineInMethod: 2");
}
if((((var4%(int)(59))/(int)(76))==(var12*var4))){
var7 = (int)(((var4+(int)(22))*((var10*var6)+(var2/(int)(32))))%(int)(74));
}
else{
 System.out.println("TP20 - TP20method2- LineInMethod: 11");
}
if(((var0-var1)<=((var11+var0)+(var4-var6)))){
var3 = (int)((var1+var3)%(int)(54));
}
else{
 var2 = (int)((var9+var2)-(var5+var9));
}
if(((var6*var2)<=(var5-var8))){
System.out.println("TP20 - TP20method2- LineInMethod: 26");
}
else{
 var1 = (int)(((var0-var12)+(var4-var2))*(var0+var5));
}
return (int)var5;

}

public static int TP20method3(int var0, int var1, int var2, int var3, int var4){
 if(((((var1%(int)(38))-(var4*(int)(11)))*(var2-var1))!=((var0+var1)*(var0/(int)(48))))){
var4 = (int)(var0*(int)(36));
}
else{
 System.out.println("TP20 - TP20method3- LineInMethod: 5");
}
switch((var2%(int)(46))){
case 0:
var2 = (int)(16);
 break;
case 1:
var0 = (int)((var1+(int)(0))+(var3*var1));
 break;
case 2:
var1 = (int)(60);
 break;
default :
System.out.println("TP20 - TP20method3- LineInMethod: 15");
}
if( (((var0-var2)+((var0%(int)(18))-(var3+var4)))<(var3*(int)(41)))){
if( ((var2-var0)<(var1+var2))){
System.out.println("TP20 - TP20method3- LineInMethod: 23");
}
}
return (int)var0;

}


public static void main(String args[]){
TP20 obj = new TP20();
TP20method0((int)(23),(int)(32),(int)(8),(int)(32),(int)(43));
TP20method1((int)(40),(int)(65),(int)(42),(int)(27),(int)(42),(int)(51),(int)(9),(int)(16),(int)(40),(int)(48),(int)(42));
obj.TP20method2((int)(28),(int)(30),(int)(33),(int)(15),(int)(27),(int)(54),(int)(14),(int)(72),(int)(67),(int)(25),(int)(7),(int)(8),(int)(68));
TP20method3((int)(23),(int)(39),(int)(63),(int)(18),(int)(49));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP20 obj = new TP20();
TP20method0(i2,i6,i8,i10,i0);
TP20method1(i11,i2,i10,i12,i1,i4,i7,i14,i8,i13,i5);
obj.TP20method2(i3,i9,i10,i13,i8,i0,i14,i5,i12,i6,i2,i7,i4);
TP20method3(i7,i4,i14,i3,i6);
}

}
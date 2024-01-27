package com.accenture.lab.carfast.test.tp4k;


public class TP22 extends TP14 implements TPInterface1, TPInterface2 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 0; i++){
 if( (((var4/(int)(60))!=(var4%(int)(11)))||(((((var11+var10)-(((((var4-var9)/(int)(14))-(var8*var6))-((var3/(int)(31))%(int)(32)))*((var10-var8)*(var9%(int)(25)))))+((var0/(int)(59))%(int)(74)))-((var6+var4)*(var5*(int)(6))))>(var9-var7)))){
System.out.println("TP22 - TPInterface1Method0- LineInMethod: 4");
}
}
if(((((var4*var3)==(var4%(int)(51)))||((((var3*var6)+((var11+var5)-((var11-(int)(19))-(var7*var9))))<=(var5+var9))&&((((var1-var11)%(int)(37))!=(var4+var2))&&((var10/(int)(2))==(var8*var3)))))||((var11+var5)>=(var11+var9)))){
TPInterface2Method3(var4,var10,var9,var10,var10);}
else{
 System.out.println("TP22 - TPInterface1Method0- LineInMethod: 12");
}
return (int)var4;

}

public int TPInterface2Method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 4; i++){
 if( ((((var0%(int)(58))%(int)(33))<(var0+var2))&&((var3-var4)==(var0-var1)))){
if( (((((var4*var3)-(var4+var3))*(var2-(int)(59)))>(var3*var4))||((var2+var4)>=(var1%(int)(24))))){
System.out.println("TP22 - TPInterface2Method0- LineInMethod: 6");
}
}
}
for(int i = 0; i < 4; i++){
 if( ((var0+var1)<(var2*var0))){
var1 = TPInterface2Method3(var4,var2,var1,var3,var2);
}
}
return (int)var4;

}

public int TPInterface2Method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if(((var11+var7)==(var0+var8))){
var3 = (int)(((var11*var1)/(int)(2))-((var1-var4)+(var2/(int)(33))));
}
else{
 var1 = (int)((var10-var1)%(int)(56));
}
for(int i = 0; i < 4; i++){
 System.out.println("TP22 - TPInterface2Method1- LineInMethod: 8");
}
return (int)var4;

}

public int TPInterface2Method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var3/(int)(3))){
case 0:
var7 = TPInterface2Method3(var12,var8,var3,var0,var3);
 break;
case 1:
System.out.println("TP22 - TPInterface2Method2- LineInMethod: 5");
 break;
case 2:
var8 = (int)((var4-var1)+(((var12*var2)/(int)(14))*(var9+var2)));
 break;
case 3:
var9 = (int)((var10+var1)*(var11/(int)(8)));
 break;
case 4:
var10 = (int)(19);
 break;
default :
var4 = (int)(22);
}
return (int)var7;

}

public int TPInterface2Method3(int var0, int var1, int var2, int var3, int var4){
 if(((var1+var3)>=(var3/(int)(57)))){
var4 = (int)(60);
}
else{
 var4 = (int)(1);
}
if(((var3+var2)==((var2+var4)+(var2%(int)(26))))){
var1 = (int)((var3+var4)/(int)(17));
}
else{
 System.out.println("TP22 - TPInterface2Method3- LineInMethod: 9");
}
return (int)var2;

}

public int TP22method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 3; i++){
 if( ((var4-var6)>(var3-var4))){
if( ((var6/(int)(9))>=(var6%(int)(73)))){
if( ((var4/(int)(13))!=(var2%(int)(33)))){
if( ((var2%(int)(33))>(var4*var6))){
if( (((var6%(int)(10))!=((var4-var6)+(var0*var1)))&&((var5*var2)>=(var4+(int)(14))))){
if( (((var0*var1)>((var0/(int)(74))*(var1-var5)))||((var6/(int)(29))!=(var4-(int)(23))))){
var5 = (int)((((var6/(int)(11))%(int)(41))*((var3+(int)(50))/(int)(43)))/(int)(35));
}
}
}
}
}
}
}
return (int)var6;

}

public int TPInterface3Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var0+var5)){
case 0:
var2 = (int)((var1-var6)-((var5+var6)/(int)(61)));
 break;
case 1:
System.out.println("TP22 - TPInterface3Method0- LineInMethod: 5");
 break;
case 2:
var1 = (int)((var6-var0)/(int)(39));
 break;
case 3:
var4 = (int)(var0-var2);
 break;
case 4:
System.out.println("TP22 - TPInterface3Method0- LineInMethod: 14");
 break;
default :
var5 = TP22method2(var6,var2,var0,var6,var0);
}
return (int)var0;

}

public int TP22method2(int var0, int var1, int var2, int var3, int var4){
 if(((var0*(int)(61))<(var3+var4))){
var4 = (int)(((var1-var4)-(var1+(int)(33)))%(int)(2));
}
else{
 var1 = (int)((var0+var2)-((var3/(int)(73))/(int)(16)));
}
for(int i = 0; i < 3; i++){
 System.out.println("TP22 - TP22method2- LineInMethod: 8");
}
return (int)var0;

}


public static void main(String args[]){
TP22 obj = new TP22();
obj.TPInterface1Method0((int)(50),(int)(55),(int)(41),(int)(52),(int)(68),(int)(52),(int)(28),(int)(55),(int)(13),(int)(16),(int)(35),(int)(28));
obj.TPInterface2Method0((int)(23),(int)(58),(int)(62),(int)(40),(int)(34));
obj.TPInterface2Method1((int)(35),(int)(21),(int)(44),(int)(34),(int)(38),(int)(42),(int)(50),(int)(55),(int)(8),(int)(27),(int)(54),(int)(62));
obj.TPInterface2Method2((int)(34),(int)(55),(int)(43),(int)(22),(int)(71),(int)(65),(int)(51),(int)(59),(int)(59),(int)(67),(int)(51),(int)(56),(int)(3));
obj.TPInterface2Method3((int)(74),(int)(3),(int)(36),(int)(14),(int)(16));
obj.TP22method0((int)(9),(int)(13),(int)(21),(int)(22),(int)(30),(int)(68),(int)(39));
obj.TPInterface3Method0((int)(61),(int)(16),(int)(52),(int)(7),(int)(66),(int)(29),(int)(32));
obj.TP22method2((int)(34),(int)(32),(int)(5),(int)(42),(int)(73));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP22 obj = new TP22();
obj.TPInterface1Method0(i2,i3,i12,i14,i5,i13,i1,i0,i9,i4,i7,i10);
obj.TPInterface2Method0(i5,i7,i1,i2,i14);
obj.TPInterface2Method1(i6,i5,i9,i12,i0,i14,i4,i3,i1,i11,i8,i10);
obj.TPInterface2Method2(i10,i12,i11,i5,i8,i7,i13,i6,i3,i14,i2,i4,i0);
obj.TPInterface2Method3(i11,i8,i3,i0,i1);
obj.TP22method0(i13,i9,i1,i0,i12,i10,i11);
obj.TPInterface3Method0(i9,i13,i10,i12,i11,i7,i6);
obj.TP22method2(i1,i13,i6,i8,i7);
}

}
package com.accenture.lab.carfast.test.tp5k;


public class TP19 extends TP22 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4){
 switch((var2%(int)(13))){
case 0:
var3 = (int)(var2/(int)(47));
 break;
case 1:
System.out.println("TP19 - TPInterface1Method0- LineInMethod: 5");
 break;
case 2:
System.out.println("TP19 - TPInterface1Method0- LineInMethod: 10");
 break;
case 3:
var2 = (int)((var2%(int)(5))/(int)(13));
 break;
case 4:
System.out.println("TP19 - TPInterface1Method0- LineInMethod: 16");
 break;
case 5:
System.out.println("TP19 - TPInterface1Method0- LineInMethod: 20");
 break;
case 6:
var1 = (int)((var1/(int)(48))-((var1-(int)(36))*(var0+var3)));
 break;
default :
var4 = TP19method2(var0,var2,var2,var2,var0,var1,var4,var2,var4,var1,var1,var1);
}
return (int)var1;

}

public int TPInterface1Method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 switch((var6-(int)(44))){
case 0:
var6 = (int)(((var8+var0)/(int)(44))*(var3-var5));
 break;
case 1:
var5 = (int)((var1/(int)(6))%(int)(64));
 break;
case 2:
System.out.println("TP19 - TPInterface1Method1- LineInMethod: 8");
 break;
default :
System.out.println("TP19 - TPInterface1Method1- LineInMethod: 15");
}
return (int)var3;

}

public int TPInterface1Method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var7+var6)){
case 0:
System.out.println("TP19 - TPInterface1Method2- LineInMethod: 2");
 break;
case 1:
System.out.println("TP19 - TPInterface1Method2- LineInMethod: 8");
 break;
case 2:
var3 = (int)(((var2*var4)+(var6*var4))*(var6+(int)(8)));
 break;
default :
System.out.println("TP19 - TPInterface1Method2- LineInMethod: 18");
}
return (int)var6;

}

public int TP22method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( (((var5*var6)+((var7/(int)(44))%(int)(36)))>(var1-var3))){
if( ((var0%(int)(75))<=(var2-var4))){
var5 = (int)(43);
}
}
switch((((var5-var4)+(var5*var7))%(int)(68))){
case 0:
var3 = (int)(var2*var1);
 break;
case 1:
var0 = (int)(52);
 break;
case 2:
var4 = (int)((var0+var2)*(var3+var5));
 break;
case 3:
var0 = TP22method3(var0,var2,var2,var3,var4,var1,var3,var4,var4);
 break;
case 4:
var0 = (int)((var0+var2)+(var5*var7));
 break;
case 5:
System.out.println("TP19 - TP22method2- LineInMethod: 20");
 break;
case 6:
var4 = (int)((var7/(int)(57))*(var7-var0));
 break;
default :
System.out.println("TP19 - TP22method2- LineInMethod: 27");
}
return (int)var7;

}

public int TP22method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if( ((var7-var8)==(((var5*var6)+(var7*var1))-(var7+(int)(21))))){
if( ((var3*var7)>=((var1+var6)*(var2+var4)))){
var5 = (int)((var7*var6)+(var5/(int)(65)));
}
}
for(int i = 0; i < 0; i++){
 System.out.println("TP19 - TP22method3- LineInMethod: 7");
}
for(int i = 0; i < 3; i++){
 System.out.println("TP19 - TP22method3- LineInMethod: 10");
}
return (int)var3;

}

public int TP19method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if(((var6*var7)==(((var3+var7)%(int)(17))+(var10%(int)(52))))){
TP22method3(var3,var7,var2,var4,var3,var3,var0,var6,var9);}
else{
 var8 = (int)((var1-var0)+(var2-var8));
}
if(((((((var5-var9)+((var10-var11)-(var3*var7)))>=(var4+var7))&&((var1*var11)>(var1-var7)))&&((var11-var4)<=(var8-var6)))&&((var5+var6)>=(((var2*var10)/(int)(44))-(var0-var3))))){
System.out.println("TP19 - TP19method2- LineInMethod: 10");
}
else{
 var3 = (int)(7);
}
for(int i = 0; i < 1; i++){
 if( ((var1*var0)<=(var6/(int)(41)))){
if( ((var4%(int)(5))!=(var6*var3))){
if( ((var5-var2)>=(var1/(int)(51)))){
System.out.println("TP19 - TP19method2- LineInMethod: 19");
}
}
}
}
return (int)var11;

}

public int TP22method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 0; i++){
 if( ((((var2%(int)(64))+(var2%(int)(29)))<(var0*var3))||((var4%(int)(37))<=(((var0-var2)/(int)(32))+(var1*(int)(32)))))){
if( ((var2%(int)(55))>=(var4*var1))){
var4 = (int)(15);
}
}
}
if(((var2-var1)!=((var2*var3)+(var1+var0)))){
var2 = (int)((var2*var0)/(int)(25));
}
else{
 System.out.println("TP19 - TP22method0- LineInMethod: 11");
}
return (int)var0;

}


public static void main(String args[]){
TP19 obj = new TP19();
obj.TPInterface1Method0((int)(16),(int)(4),(int)(14),(int)(3),(int)(63));
obj.TPInterface1Method1((int)(26),(int)(1),(int)(33),(int)(41),(int)(74),(int)(3),(int)(22),(int)(5),(int)(21));
obj.TPInterface1Method2((int)(10),(int)(54),(int)(43),(int)(62),(int)(74),(int)(38),(int)(11),(int)(15));
obj.TP22method2((int)(63),(int)(56),(int)(11),(int)(41),(int)(0),(int)(27),(int)(8),(int)(60));
obj.TP22method3((int)(17),(int)(49),(int)(37),(int)(74),(int)(62),(int)(47),(int)(68),(int)(45),(int)(71));
obj.TP19method2((int)(44),(int)(56),(int)(53),(int)(37),(int)(49),(int)(44),(int)(57),(int)(53),(int)(60),(int)(73),(int)(27),(int)(61));
obj.TP22method0((int)(7),(int)(51),(int)(24),(int)(54),(int)(21));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP19 obj = new TP19();
obj.TPInterface1Method0(i3,i4,i14,i2,i7);
obj.TPInterface1Method1(i7,i2,i10,i12,i0,i3,i5,i6,i11);
obj.TPInterface1Method2(i11,i12,i4,i14,i13,i8,i7,i1);
obj.TP22method2(i6,i9,i10,i7,i12,i1,i4,i0);
obj.TP22method3(i5,i0,i8,i2,i13,i14,i1,i3,i12);
obj.TP19method2(i1,i8,i9,i14,i7,i10,i5,i12,i0,i2,i13,i6);
obj.TP22method0(i13,i14,i11,i1,i12);
}

}
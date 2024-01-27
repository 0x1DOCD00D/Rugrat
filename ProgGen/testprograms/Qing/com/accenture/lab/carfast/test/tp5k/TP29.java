package com.accenture.lab.carfast.test.tp5k;


public class TP29 extends TP25 {


public int TP25method2(int var0, int var1, int var2, int var3, int var4){
 if(((var0-var4)>(var2-var1))){
var4 = (int)(10);
}
else{
 var2 = (int)((var3%(int)(55))-(var1%(int)(2)));
}
if( ((var0-var1)<=(var4+var3))){
if( (((var0/(int)(30))>=((var1%(int)(26))-(var3*var4)))||(((var4+var1)==((var0-var2)-((var1*var0)/(int)(74))))&&(((var0+var1)*(var3+var1))<=(var1/(int)(42)))))){
if( ((var0-var1)>=(var1%(int)(10)))){
if( ((var1*var3)!=(var1/(int)(11)))){
var2 = (int)(((var0*var4)-(var4*var1))+(var3-var2));
}
}
}
}
for(int i = 0; i < 3; i++){
 var0 = (int)(((var3*var2)-(var0+(int)(9)))*(var0+var4));
}
switch((var4/(int)(70))){
case 0:
System.out.println("TP29 - TP25method2- LineInMethod: 19");
 break;
case 1:
var4 = (int)(34);
 break;
case 2:
System.out.println("TP29 - TP25method2- LineInMethod: 24");
 break;
case 3:
System.out.println("TP29 - TP25method2- LineInMethod: 30");
 break;
case 4:
var1 = (int)((var4/(int)(30))/(int)(47));
 break;
default :
System.out.println("TP29 - TP25method2- LineInMethod: 40");
}
return (int)var1;

}

public int TP28method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var4*var3)==(var3*var5))){
var6 = (int)((var6%(int)(14))%(int)(40));
}
for(int i = 0; i < 3; i++){
 System.out.println("TP29 - TP28method0- LineInMethod: 5");
}
if(((var1+(int)(28))<(var2-var4))){
var0 = (int)((var5+var6)*(var2-(int)(3)));
}
else{
 var2 = TP29method2(var0,var6,var2,var6,var3);
}
for(int i = 0; i < 0; i++){
 if( ((var4*var1)>=(var5*(int)(32)))){
TP28method2(var5,var5,var4,var1,var5);}
}
if((((var5/(int)(37))==(var5/(int)(34)))||((var1-(int)(39))<=(var1*var0)))){
var1 = (int)(var5-(int)(7));
}
else{
 TP29method2(var5,var2,var5,var1,var3);}
return (int)var0;

}

public int TP29method2(int var0, int var1, int var2, int var3, int var4){
 if( ((var2*var3)>=((var2+var1)*(var0/(int)(75))))){
System.out.println("TP29 - TP29method2- LineInMethod: 2");
}
for(int i = 0; i < 3; i++){
 System.out.println("TP29 - TP29method2- LineInMethod: 7");
}
switch((var1%(int)(34))){
case 0:
System.out.println("TP29 - TP29method2- LineInMethod: 14");
 break;
case 1:
System.out.println("TP29 - TP29method2- LineInMethod: 17");
 break;
case 2:
System.out.println("TP29 - TP29method2- LineInMethod: 23");
 break;
default :
System.out.println("TP29 - TP29method2- LineInMethod: 29");
}
return (int)var3;

}

public static int TP28method2(int var0, int var1, int var2, int var3, int var4){
 if( ((var2+var1)>((var2*(int)(23))+(var1%(int)(32))))){
System.out.println("TP29 - TP28method2- LineInMethod: 2");
}
if( ((var4-var2)==(var0/(int)(20)))){
if( (((var0+var1)>((var0+(int)(22))-(var1*(int)(39))))&&((var1+var4)!=(var4*var0)))){
if( ((var0+var3)==(var0*(int)(53)))){
if( ((var3*(int)(12))==(var1*var2))){
var1 = (int)((var1+var4)%(int)(58));
}
}
}
}
if( ((((var1+var2)-(var4*(int)(57)))+((var0/(int)(47))-(var0+(int)(37))))<(var3/(int)(47)))){
System.out.println("TP29 - TP28method2- LineInMethod: 16");
}
if( ((var3*var0)!=(var4+(int)(47)))){
System.out.println("TP29 - TP28method2- LineInMethod: 23");
}
return (int)var4;

}


public static void main(String args[]){
TP29 obj = new TP29();
obj.TP25method2((int)(50),(int)(74),(int)(68),(int)(16),(int)(44));
obj.TP28method0((int)(31),(int)(48),(int)(46),(int)(45),(int)(71),(int)(62),(int)(46));
obj.TP29method2((int)(67),(int)(36),(int)(73),(int)(43),(int)(2));
TP28method2((int)(9),(int)(47),(int)(32),(int)(5),(int)(0));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP29 obj = new TP29();
obj.TP25method2(i1,i5,i3,i10,i9);
obj.TP28method0(i4,i1,i12,i8,i2,i11,i0);
obj.TP29method2(i14,i3,i11,i6,i13);
TP28method2(i1,i7,i14,i13,i5);
}

}
package com.accenture.lab.carfast.test.tp5k;


public class TP25 extends TP28 {


public static int TP28method2(int var0, int var1, int var2, int var3, int var4){
 if( ((var1/(int)(76))==((var3/(int)(13))%(int)(49)))){
if( ((var2*var1)!=(var0-(int)(26)))){
var2 = (int)((var1/(int)(6))*(var0-var1));
}
}
for(int i = 0; i < 4; i++){
 var3 = (int)(((var1*var3)+(var4*var1))*(var3+var4));
}
if((((var1+var0)%(int)(55))<(var0-var4))){
System.out.println("TP25 - TP28method2- LineInMethod: 12");
}
else{
 System.out.println("TP25 - TP28method2- LineInMethod: 13");
}
if( ((var3+(int)(16))<(var3*var1))){
if( ((var4-var2)>=(var0*var1))){
if( ((var4-var0)!=(var3+var2))){
if( (((((var3-var1)+(var4*var1))-(((var1+var4)-(var0*var2))-((((var1-var3)+(int)(2))+(var0%(int)(29)))-(var2+var3))))*(var2-var1))!=(var0-var1))){
System.out.println("TP25 - TP28method2- LineInMethod: 25");
}
}
}
}
return (int)var2;

}

public static int TP28method3(int var0, int var1, int var2, int var3, int var4){
 if(((var4%(int)(9))==((var1+var2)%(int)(46)))){
var0 = (int)(((var0*(int)(17))*(var4-var2))+(var3+(int)(11)));
}
else{
 var1 = (int)((var4%(int)(7))*(var2*(int)(63)));
}
if((((var1%(int)(74))==(var3-var1))||(((var4+var1)-(var3+var2))<=(var0/(int)(57))))){
var4 = (int)((var2%(int)(24))+(((var3-(int)(48))+(var4-(int)(68)))-((var0*var1)-(var1*var4))));
}
else{
 var4 = (int)((var2-var4)*(var0-var1));
}
switch((var2%(int)(42))){
case 0:
var3 = (int)(73);
 break;
case 1:
System.out.println("TP25 - TP28method3- LineInMethod: 16");
 break;
case 2:
var1 = (int)(42);
 break;
case 3:
var2 = (int)((var3+var4)*(var4+var3));
 break;
case 4:
var4 = (int)(31);
 break;
case 5:
System.out.println("TP25 - TP28method3- LineInMethod: 27");
 break;
case 6:
System.out.println("TP25 - TP28method3- LineInMethod: 30");
 break;
default :
var0 = (int)((var3%(int)(55))-(var0-(int)(54)));
}
return (int)var2;

}

public int TP25method2(int var0, int var1, int var2, int var3, int var4){
 switch((var2*(int)(48))){
case 0:
TP28method3(var3,var2,var0,var3,var2); break;
case 1:
System.out.println("TP25 - TP25method2- LineInMethod: 5");
 break;
case 2:
TP28method3(var3,var4,var1,var1,var2); break;
case 3:
System.out.println("TP25 - TP25method2- LineInMethod: 15");
 break;
default :
System.out.println("TP25 - TP25method2- LineInMethod: 21");
}
if(((var4*var3)>=(var2-var4))){
System.out.println("TP25 - TP25method2- LineInMethod: 28");
}
else{
 System.out.println("TP25 - TP25method2- LineInMethod: 30");
}
return (int)var0;

}

public int TP28method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if(((var6-var0)==(var4*var0))){
var3 = (int)(var5%(int)(21));
}
else{
 System.out.println("TP25 - TP28method0- LineInMethod: 5");
}
switch((var0*var2)){
case 0:
System.out.println("TP25 - TP28method0- LineInMethod: 9");
 break;
case 1:
TP25method2(var5,var6,var4,var6,var0); break;
case 2:
var3 = (int)((var4*var2)-(var2*var1));
 break;
case 3:
System.out.println("TP25 - TP28method0- LineInMethod: 21");
 break;
case 4:
System.out.println("TP25 - TP28method0- LineInMethod: 28");
 break;
case 5:
var4 = (int)((var5+var0)-(var5-var0));
 break;
default :
var4 = (int)((var5*var3)%(int)(35));
}
return (int)var6;

}


public static void main(String args[]){
TP25 obj = new TP25();
TP28method2((int)(48),(int)(61),(int)(8),(int)(49),(int)(31));
TP28method3((int)(49),(int)(35),(int)(34),(int)(3),(int)(10));
obj.TP25method2((int)(46),(int)(29),(int)(1),(int)(31),(int)(51));
obj.TP28method0((int)(57),(int)(50),(int)(15),(int)(34),(int)(1),(int)(8),(int)(0));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP25 obj = new TP25();
TP28method2(i13,i7,i6,i10,i12);
TP28method3(i4,i14,i0,i7,i12);
obj.TP25method2(i1,i9,i7,i5,i2);
obj.TP28method0(i12,i13,i7,i2,i6,i9,i1);
}

}
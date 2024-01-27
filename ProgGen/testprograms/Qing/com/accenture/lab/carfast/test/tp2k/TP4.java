package com.accenture.lab.carfast.test.tp2k;


public class TP4 extends TP6 {


public int TP4method0(int var0, int var1, int var2, int var3){
 if( ((var3/(int)(1))!=(var2-(int)(20)))){
System.out.println("TP4 - TP4method0- LineInMethod: 2");
}
if( ((var3%(int)(42))<=(var2+var3))){
if( ((var1+var2)>=(var3*var2))){
var0 = (int)((var1*var2)/(int)(17));
}
}
switch((var1*var0)){
case 0:
System.out.println("TP4 - TP4method0- LineInMethod: 13");
 break;
case 1:
var2 = (int)(var2+(int)(18));
 break;
case 2:
System.out.println("TP4 - TP4method0- LineInMethod: 19");
 break;
case 3:
System.out.println("TP4 - TP4method0- LineInMethod: 26");
 break;
case 4:
var3 = (int)((var0-var1)-(var1*var3));
 break;
case 5:
System.out.println("TP4 - TP4method0- LineInMethod: 35");
 break;
case 6:
var1 = (int)(9);
 break;
case 7:
System.out.println("TP4 - TP4method0- LineInMethod: 40");
 break;
case 8:
System.out.println("TP4 - TP4method0- LineInMethod: 43");
 break;
default :
var0 = (int)(((var1*var3)+(var2+var1))+((var3%(int)(42))*(var2*var3)));
}
return (int)var0;

}

public int TP6method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var9+var3)>=((var6*var0)+(var9/(int)(12))))){
System.out.println("TP4 - TP6method0- LineInMethod: 4");
}
else{
 System.out.println("TP4 - TP6method0- LineInMethod: 6");
}
for(int i = 0; i < 3; i++){
 var6 = (int)(var4/(int)(32));
}
return (int)var9;

}

public int TP4method2(int var0, int var1, int var2, int var3){
 switch((var0*(int)(13))){
case 0:
System.out.println("TP4 - TP4method2- LineInMethod: 2");
 break;
case 1:
var3 = (int)((var0*var1)+(var2+(int)(17)));
 break;
case 2:
var2 = (int)(35);
 break;
case 3:
System.out.println("TP4 - TP4method2- LineInMethod: 11");
 break;
case 4:
System.out.println("TP4 - TP4method2- LineInMethod: 15");
 break;
case 5:
var0 = (int)((var1-var2)+(var2%(int)(5)));
 break;
case 6:
System.out.println("TP4 - TP4method2- LineInMethod: 22");
 break;
case 7:
System.out.println("TP4 - TP4method2- LineInMethod: 27");
 break;
default :
System.out.println("TP4 - TP4method2- LineInMethod: 34");
}
return (int)var0;

}

public int TP6method2(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 3; i++){
 System.out.println("TP4 - TP6method2- LineInMethod: 2");
}
switch((var2*(int)(31))){
case 0:
System.out.println("TP4 - TP6method2- LineInMethod: 5");
 break;
case 1:
var1 = (int)((var2+(int)(29))+(var1/(int)(22)));
 break;
case 2:
System.out.println("TP4 - TP6method2- LineInMethod: 12");
 break;
default :
var0 = (int)((var3-(int)(11))-(var2+var1));
}
return (int)var0;

}


public static void main(String args[]){
TP4 obj = new TP4();
obj.TP4method0((int)(3),(int)(45),(int)(4),(int)(36));
obj.TP6method0((int)(4),(int)(1),(int)(46),(int)(18),(int)(1),(int)(8),(int)(42),(int)(40),(int)(46),(int)(18));
obj.TP4method2((int)(33),(int)(43),(int)(26),(int)(34));
obj.TP6method2((int)(6),(int)(26),(int)(32),(int)(16));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP4 obj = new TP4();
obj.TP4method0(i1,i11,i4,i2);
obj.TP6method0(i5,i12,i7,i14,i4,i1,i11,i8,i9,i6);
obj.TP4method2(i10,i8,i0,i1);
obj.TP6method2(i11,i13,i4,i5);
}

}
package com.accenture.lab.carfast.test.tp7k;


public class TP29 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if( ((var3%(int)(3))>(var9+var0))){
if( ((var0+var6)>(var0+var9))){
if( ((var6-var7)<(var6*var7))){
if( ((var7-var3)<(var5-var7))){
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 8");
}
}
}
}
switch((var7*var6)){
case 0:
TP29method1(var1,var9,var4,var0,var0); break;
case 1:
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 14");
 break;
case 2:
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 19");
 break;
case 3:
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 22");
 break;
case 4:
var3 = (int)(15);
 break;
case 5:
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 30");
 break;
case 6:
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 35");
 break;
case 7:
var4 = (int)((var4-var6)/(int)(42));
 break;
default :
System.out.println("TP29 - TPInterface1Method0- LineInMethod: 45");
}
return (int)var6;

}

public static int TP29method0(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 4; i++){
 if( ((var5+(int)(48))<(var5+var4))){
var1 = TP29method1(var1,var1,var0,var2,var1);
}
}
if( ((((((var1%(int)(41))%(int)(19))!=(((var3%(int)(30))%(int)(22))+(var3/(int)(18))))&&(((var0*var4)-(var5*var0))>=(var2%(int)(29))))&&((var5+(int)(18))>(var5+var4)))&&((var1*var2)>=(((var2+var5)-(var5/(int)(19)))*((var1*var2)*(var3/(int)(33))))))){
if( ((var1*var5)>=(var5*var4))){
var0 = (int)((var4*(int)(33))-(var4+var5));
}
}
switch((var5+(int)(42))){
case 0:
var3 = (int)(((var1/(int)(38))/(int)(4))-(var0+var1));
 break;
case 1:
System.out.println("TP29 - TP29method0- LineInMethod: 15");
 break;
case 2:
var0 = (int)(var4*(int)(49));
 break;
default :
var1 = (int)((var0*var4)+(var5*var3));
}
switch((var0*(int)(31))){
case 0:
System.out.println("TP29 - TP29method0- LineInMethod: 24");
 break;
case 1:
TP29method1(var2,var0,var0,var4,var4); break;
case 2:
TP29method1(var4,var4,var5,var4,var2); break;
default :
var0 = (int)((var2-var5)/(int)(5));
}
return (int)var2;

}

public static int TP29method1(int var0, int var1, int var2, int var3, int var4){
 if(((var1/(int)(25))<=(var2+var3))){
System.out.println("TP29 - TP29method1- LineInMethod: 4");
}
else{
 var2 = (int)((var0%(int)(33))+(var4+var1));
}
if(((((var3%(int)(19))*(var4+var1))*(var3/(int)(28)))<=(var2*var1))){
System.out.println("TP29 - TP29method1- LineInMethod: 11");
}
else{
 var1 = (int)((var2/(int)(45))-(var1-var4));
}
if(((((((var2/(int)(30))*(var4+var1))-(var3/(int)(42)))*(var4+var0))>=(var2%(int)(45)))&&((var0-var3)<=(var2%(int)(33))))){
var2 = (int)(19);
}
else{
 var0 = (int)(40);
}
switch((var1-(int)(4))){
case 0:
System.out.println("TP29 - TP29method1- LineInMethod: 19");
 break;
case 1:
var3 = (int)(38);
 break;
case 2:
var1 = (int)(((var2%(int)(5))%(int)(40))+(var3+var1));
 break;
default :
var0 = (int)((var1-var3)*(var3-(int)(27)));
}
for(int i = 0; i < 4; i++){
 System.out.println("TP29 - TP29method1- LineInMethod: 34");
}
return (int)var1;

}


public static void main(String args[]){
TP29 obj = new TP29();
obj.TPInterface1Method0((int)(31),(int)(12),(int)(12),(int)(20),(int)(19),(int)(20),(int)(47),(int)(6),(int)(20),(int)(2));
TP29method0((int)(6),(int)(27),(int)(18),(int)(36),(int)(13),(int)(27));
TP29method1((int)(30),(int)(36),(int)(0),(int)(36),(int)(33));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP29 obj = new TP29();
obj.TPInterface1Method0(i11,i9,i13,i5,i14,i1,i4,i3,i2,i6);
TP29method0(i8,i5,i9,i11,i13,i4);
TP29method1(i1,i7,i4,i2,i6);
}

}
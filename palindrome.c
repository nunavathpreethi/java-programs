int pali(int n);
int pali(int n){
    
    int r,rev=0,temp=n;

    while(n>0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    return temp=rev;
}
int main(){
    int n;
    printf("enter num");
    scanf("%d",&n);
    if(pali(n))
      printf("%d is a palidrome num",n);
    else
      printf("not pali");
}

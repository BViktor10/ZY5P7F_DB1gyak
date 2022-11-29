#include <stdio.h>
#include <stdlib.h>
void pelda();

int main()
{
    pelda();
    getch();
    return 0;
}

void pelda() {
    FILE *fp;
    char ch;
    char fnev[50];
    printf("Fajlneve (MAX 50 karakter): ");
    scanf("%s", fnev);
    fp = fopen(fnev, "w");
    printf("Fajlba irt szoveg: ");
    while((ch=getchar()) != '#')
    {
        putc(ch, fp);
    }
    fclose(fp);

    fp = fopen(fnev, "r");
    while ((ch=getc(fp)) != EOF) {
        printf("%c",toupper(ch));
    }
    fclose(fp);
}

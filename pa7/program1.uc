int a;
int b;

string less = "a is less than b\n";
string equal = "a is equal to b\n";
string greater = "a is greater than b\n"

int main()
{

    read(a);
    read(b);

    if (a > b)
    {
        print(less);
    }
    else
    {
        if (a == b)
        {
            print(equal);
        }
        else
        {
            print(greater);
        }

    }
    
    return 0;
}
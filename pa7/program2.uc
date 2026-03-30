string prompt = "Please enter a positive integer\n";

int main()
{
    int n;
    int count;
    n = 0;
    count = 0;

    while (n <= 0)
    {
        print(prompt);
        read(n);
    }
    
    while (n > 1)
    {
        print(n);
        if (n - 2*(n/2) == 0)
        {
            n = n/2;
            count = count + 1;
        }
        else
        {
            n = 3*n + 1;
            count = count + 1;
        }

    }

    print(n);
    print(count);

    
    return 0;
}
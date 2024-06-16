#include <iostream>
#include <array>
using namespace std;

class GFriend {
public:
	GFriend(int age, string name)
	{
		this->age = age;		// 类内可以访问到的成员变量
		this->name = name;		// 类内可以访问到的成员变量
		cout << "age = " << this->age << " name = " << this->name << endl;
	}
	~GFriend() {}
	void call()
	{
		cout << "会做饭 " << endl;
	}
private:
	int age;
	string name;
};

void func1()
{
	bool m = true;
	bool n = false;
	cout << m << endl;
	cout << n << endl;
}

void func2()
{
	cout << "sizeof of char\t" << sizeof(char) << endl;					// 1
	cout << "sizeof of int\t" << sizeof(int) << endl;					// 4
	cout << "sizeof of short\t" << sizeof(short) << endl;				// 2
	cout << "sizeof of double\t" << sizeof(double) << endl;				// 8
	cout << "sizeof of float\t" << sizeof(float) << endl;				// 4
	cout << "sizeof of long\t" << sizeof(long) << endl;					// 4
	cout << "sizeof of long long\t" << sizeof(long long) << endl;		// 8
	// long long  = double > long = int = float > short > char
}

void func3()
{
	bool a = false;
	if (true == a)
	{

	}
}

void func4()
{
	std::array<int, 5> arr = { 1,2,3,4,5 };
	for (int num : arr)
	{
		cout << num << endl;
	}
}

// 二维数组
void func5()
{
	int arr[][4] = {
		{1,2,3,4},
		{5,6,7,8}
	};
	int len_out = sizeof(arr) / sizeof(arr[0]);
	int len_in = sizeof(arr[0]) / sizeof(int);

	for (int i = 0; i < len_out; i++)
	{
		for (int j = 0; j < len_in; j++)
		{
			cout << arr[i][j] << "  ";
		}
		cout << endl;
	}
}

int main()
{
	GFriend* gf = new GFriend(18, "仓");
	// gf->age;		// 类外不可以进行访问

	return 0;
}
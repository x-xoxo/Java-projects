#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <limits.h>

void prog_01(); // 함수 선언
void prog_02();
void prog_03();
void prog_04();
void prog_05();
void prog_06();
void prog_07();
void prog_08();
void prog_09();
void prog_10();
void prog_11();
void prog_12();

int main()
{
	//int year_sal, month_sal;
	//printf("연봉을 입력하시오(단위:만원): ");
	//scanf_s("%d", &year_sal);
	//month_sal = year_sal / 12;
	//printf("월 수령액(단위:만원): %d\n", month_sal);

	//float r, area;
	//printf("반지름을 입력하시오: ");
	//scanf_s("%f", &r);
	//area = 3.141592 * r * r;
	//printf("원의 면적: %f\n", area);
	//return 0;

	//double rate, usd, krw;
	//printf("환율을 입력하시오: ");
	//scanf_s("%lf", &rate);
	//printf("원화 금액을 입력하시오: ");
	//scanf_s("%lf", &krw);
	//usd = krw / rate;
	//printf("원화 %lf원은 %lf달러 입니다.\n", krw, usd);
	//return 0;

	//double width, height, area, perimeter;
	//printf("가로길이를 입력해주세요: ");
	//scanf_s("%lf", &width);
	//printf("높이를 입력해주세요: ");
	//scanf_s("%lf", &height);
	//area = width * height;
	//perimeter = 2 * (width + height);
	//printf("사각형의 넓이: %f\n", area);
	//printf("사각형의 둘레: %f\n", perimeter);
	//return 0;

	//prog_01();
	//prog_02();
	//prog_03();
	//prog_04();
	//prog_05();
	//prog_06();
	//prog_07();
	//prog_08();
	//prog_09();
	//prog_10();
	//prog_11();
	prog_12();
}
void prog_12()
{
	double speed_light, dist_sun_earth, time_arriv;
	speed_light = 300000;
	dist_sun_earth = 149600000;
	time_arriv = dist_sun_earth / speed_light;
	printf("빛의 속도는 %lfkm/s\n", speed_light);
	printf("태양과 지구와의 거리는 %lfkm\n", dist_sun_earth);
	printf("도달 시간은 %lf초\n", time_arriv);
	printf("도달 시간은 %d분%d초\n", (int)( time_arriv / 60 ) % 60, (int)time_arriv % 60);
}
void prog_11()
{
	int id, passwd;
	printf("아이디와 패스워드를 4개의 숫자로 입력하세요\n");
	printf("ID: ____\b\b\b\b");
	scanf("%d", &id);
	printf("PW: ____\b\b\b\b");
	scanf("%d", &passwd);
	printf("\a입력된 아이디는 \"%d\"이고 패스워드는 \"%d\"입니다.\n", id, passwd);
}
void prog_10()
{
	float x = 1.234567890123456789;
	double y = 1.234567890123456789;
	printf("float의 크기=%d\n", sizeof(float));
	printf("double의 크기=%d\n", sizeof(double));

	printf("x = %30.25f\n", x);
	printf("y = %30.25f\n", y);
}
void prog_09()
{
	short a = 32767;
	printf("%d\n", a);
	a = a + 1;
	printf("%d\n", a);
}
void prog_08()
{
	short s_money = SHRT_MAX;
	unsigned short u_money = USHRT_MAX;

	s_money = s_money + 1;
	printf("s_money = %d\n", s_money);
	u_money = u_money + 1;
	printf("u_money = %d\n", u_money);
}
void prog_07()
{
	short year = 0;
	int sale = 0;
	long total_sale = 0;
	long long large_value;
	year = 10;
	sale = 200000000;
	total_sale = year * sale;
	large_value = year * sale;
	printf("total_sale = %d\nlarge_value = %d\n", total_sale, large_value);
}
void prog_06()
{
	double wMoon, wEarth;
	printf("몸무게를 입력하세요(단위: Kg): ");
	scanf_s("%lf", &wEarth);
	wMoon = wEarth * 0.17;
	printf("달에서의 몸무게는 %.2lfKg입니다.\n", wMoon);
}
void prog_05()
{
	double x, result;
	printf("실수를 입력하세요: ");
	scanf_s("%lf", &x);
	result = (3 * x * x) + 7 * x + 11;
	printf("다항식의 값은 %lf\n", result);
}
void prog_04()
{
	double c, f;
	printf("화씨값을 입력하시오: ");
	scanf_s("%lf", &f);
	c = (5.0 / 9.0) * (f - 32.0);
	printf("섭씨값은 %lf도입니다.\n", c);
}
void prog_03()
{
	float height, base, area;
	printf("삼각형의 밑변을 입력하세요: ");
	scanf_s("%f", &base);
	printf("삼각형의 높이를 입력하세요: ");
	scanf_s("%f", &height);
	area = 0.5 * height * base;
	printf("삼각형의 넓이: %f\n", area);
}
void prog_02()
{
	float mile, meter;
	printf("변환할 마일의 값을 입력하세요: ");
	scanf_s("%f", &mile);
	meter = 1609.0 * mile;
	printf("%f마일은 %f미터입니다.\n", mile, meter);
}
void prog_01() // 함수 정의
{
	double a, b, c, sum, avg;
	printf("실수를 입력하시오: ");
	scanf("%lf", &a);
	printf("실수를 입력하시오: ");
	scanf("%lf", &b);
	printf("실수를 입력하시오: ");
	scanf("%lf", &c);
	sum = a + b + c;
	avg = sum / 3.0;
	printf("합은 %f이고, 평균은 %f 입니다.\n", sum, avg);
}
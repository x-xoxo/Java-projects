#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <limits.h>

void prog_01(); // �Լ� ����
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
	//printf("������ �Է��Ͻÿ�(����:����): ");
	//scanf_s("%d", &year_sal);
	//month_sal = year_sal / 12;
	//printf("�� ���ɾ�(����:����): %d\n", month_sal);

	//float r, area;
	//printf("�������� �Է��Ͻÿ�: ");
	//scanf_s("%f", &r);
	//area = 3.141592 * r * r;
	//printf("���� ����: %f\n", area);
	//return 0;

	//double rate, usd, krw;
	//printf("ȯ���� �Է��Ͻÿ�: ");
	//scanf_s("%lf", &rate);
	//printf("��ȭ �ݾ��� �Է��Ͻÿ�: ");
	//scanf_s("%lf", &krw);
	//usd = krw / rate;
	//printf("��ȭ %lf���� %lf�޷� �Դϴ�.\n", krw, usd);
	//return 0;

	//double width, height, area, perimeter;
	//printf("���α��̸� �Է����ּ���: ");
	//scanf_s("%lf", &width);
	//printf("���̸� �Է����ּ���: ");
	//scanf_s("%lf", &height);
	//area = width * height;
	//perimeter = 2 * (width + height);
	//printf("�簢���� ����: %f\n", area);
	//printf("�簢���� �ѷ�: %f\n", perimeter);
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
	printf("���� �ӵ��� %lfkm/s\n", speed_light);
	printf("�¾�� �������� �Ÿ��� %lfkm\n", dist_sun_earth);
	printf("���� �ð��� %lf��\n", time_arriv);
	printf("���� �ð��� %d��%d��\n", (int)( time_arriv / 60 ) % 60, (int)time_arriv % 60);
}
void prog_11()
{
	int id, passwd;
	printf("���̵�� �н����带 4���� ���ڷ� �Է��ϼ���\n");
	printf("ID: ____\b\b\b\b");
	scanf("%d", &id);
	printf("PW: ____\b\b\b\b");
	scanf("%d", &passwd);
	printf("\a�Էµ� ���̵�� \"%d\"�̰� �н������ \"%d\"�Դϴ�.\n", id, passwd);
}
void prog_10()
{
	float x = 1.234567890123456789;
	double y = 1.234567890123456789;
	printf("float�� ũ��=%d\n", sizeof(float));
	printf("double�� ũ��=%d\n", sizeof(double));

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
	printf("�����Ը� �Է��ϼ���(����: Kg): ");
	scanf_s("%lf", &wEarth);
	wMoon = wEarth * 0.17;
	printf("�޿����� �����Դ� %.2lfKg�Դϴ�.\n", wMoon);
}
void prog_05()
{
	double x, result;
	printf("�Ǽ��� �Է��ϼ���: ");
	scanf_s("%lf", &x);
	result = (3 * x * x) + 7 * x + 11;
	printf("���׽��� ���� %lf\n", result);
}
void prog_04()
{
	double c, f;
	printf("ȭ������ �Է��Ͻÿ�: ");
	scanf_s("%lf", &f);
	c = (5.0 / 9.0) * (f - 32.0);
	printf("�������� %lf���Դϴ�.\n", c);
}
void prog_03()
{
	float height, base, area;
	printf("�ﰢ���� �غ��� �Է��ϼ���: ");
	scanf_s("%f", &base);
	printf("�ﰢ���� ���̸� �Է��ϼ���: ");
	scanf_s("%f", &height);
	area = 0.5 * height * base;
	printf("�ﰢ���� ����: %f\n", area);
}
void prog_02()
{
	float mile, meter;
	printf("��ȯ�� ������ ���� �Է��ϼ���: ");
	scanf_s("%f", &mile);
	meter = 1609.0 * mile;
	printf("%f������ %f�����Դϴ�.\n", mile, meter);
}
void prog_01() // �Լ� ����
{
	double a, b, c, sum, avg;
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &a);
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &b);
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &c);
	sum = a + b + c;
	avg = sum / 3.0;
	printf("���� %f�̰�, ����� %f �Դϴ�.\n", sum, avg);
}
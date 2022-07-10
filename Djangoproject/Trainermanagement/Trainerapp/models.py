from django.db import models

# Create your models here.
class City(models.Model):
    City_name = models.CharField(max_length=50)

    def __str__(self):
        return f"{self.City_name}"


class Course(models.Model):
    course_name = models.CharField(max_length=50)

    def __str__(self):
        return f'{self.course_name}'

class Trainer_Register(models.Model):
    tname = models.CharField(max_length=50)
    tage = models.IntegerField()
    tphno = models.BigIntegerField()
    temail = models.CharField(max_length=50)
    tcity = models.ForeignKey(City,on_delete = models.CASCADE, default = None)

    def __str__(self):
        return f'{self.tname}'


    # def __str__(self):
    #     return f'{self.tname},{self.tage},{self.tphno},{self.temail},{self.tcity}'

class Trainer_Assign(models.Model):
    tname = models.ForeignKey(Trainer_Register,on_delete = models.CASCADE,default=None)
    batchno = models.IntegerField()
    course = models.ForeignKey(Course,on_delete=models.CASCADE,default=None)
    date = models.DateTimeField()

    def __str__(self):
        return f'{self.batchno},{self.date}'
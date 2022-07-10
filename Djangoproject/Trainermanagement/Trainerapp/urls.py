from django.urls import path

from Trainerapp import views

urlpatterns = [
    path('',views.home,name='home'),
    path('logread',views.log_read),
    path('register',views.trainer_register,name='reg'),
    path('trainerreg',views.register_data),
    path('adminhome',views.admin_home,name='adminhome'),
    path('trainerdet',views.trainer_details,name='trainer_details'),
    path('trainerassign',views.trainer_assign,name='trainerassign'),
    path('assign',views.assign_batch),
    path('details',views.batch_details,name='details'),
    path('delete/<int:id>',views.delete_batch,name='del'),
    path('update/<int:id>',views.update_batch,name='up')
]
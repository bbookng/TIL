# django-seed

```bash
$ pip install django-seed
$ pip install psycopg2
```

- `settings.py` 의 `INSTALLED_APPS` 에 'django_seed' 추가

``` python
INSTALLED_APPS = [
    'music',
    'django_extensions',
    'rest_framework',
    'django_seed',
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
]
```

```bash
python manage.py seed articles -- number=20
```


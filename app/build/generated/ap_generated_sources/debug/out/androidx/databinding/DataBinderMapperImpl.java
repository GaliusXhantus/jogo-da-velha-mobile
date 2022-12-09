package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new br.com.xhantusgalius.meus_apps.DataBinderMapperImpl());
  }
}

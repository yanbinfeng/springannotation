package com.sunline.config;

import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author yanbinfeng
 * @date 2020/4/8- 21:44
 */
public class MyTypeFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Class<? extends MetadataReader> aClass = metadataReader.getClass();
        if(aClass.getName().contains("er")){

            return true;
        }
       System.out.println("annotation======>"+annotationMetadata);
       System.out.println("class======>"+classMetadata);
       System.out.println("aclass======>"+aClass);
        return false;
    }
}

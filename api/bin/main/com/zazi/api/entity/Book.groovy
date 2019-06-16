package com.zazi.api.entity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column
import javax.persistence.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "books")
class Book
 {

@Id    
@GeneratedValue(strategy = GenerationType.IDENTITY)    
@Column(name="id")
Integer id 

@NotNull    
@Column(name="name")
String name 

@NotNull    
@Column(name="isbn")
String isbn

@NotNull    
@Column(name="distributor") 
String distributor

@NotNull    
@Column(name="pengarang") 
String pengarang

@NotNull    
@Column(name="editor") 
String editor

@NotNull    
@Column(name="tahunterbit") 
String tahunterbit


  @ManyToOne( // 'categories'  Book
      fetch = FetchType.EAGER, // Book 
      optional = false 
  )
   
    Category category

 }

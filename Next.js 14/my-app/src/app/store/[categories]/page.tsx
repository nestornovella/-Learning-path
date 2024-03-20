import React from "react";

interface categoryParams{
    params:{
        categories: String,
        searchParams:{}
    },
    children:React.ReactNode
}


function Categories(props : categoryParams) {
    const {categories} = props.params 
    const {children} = props
    console.log(children)
    return ( <h1>
        {categories}
    </h1> );
}

export default Categories;
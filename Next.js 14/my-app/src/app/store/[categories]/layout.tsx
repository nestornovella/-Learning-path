import Link from "next/link";
import React from "react";

interface ReactCHildInterface {
    children: React.ReactNode
}


function Layouts(props : ReactCHildInterface) {

    return (
        <main>
            <nav>
                <Link href={'/'}>Home</Link>
                <Link href={"/store"}>Category</Link>
            </nav>
            {
                props.children
            }
        </main>
    );
}

export default Layouts;
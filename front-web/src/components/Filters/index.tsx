import React from 'react';
import { Link } from 'react-router-dom';
import './styles.css'

type Props = {
    link: string;
    linkText: string;
}

const Filters = ({ link, linkText}: Props) =>(
    <div className="filters-container records-actions filter-container">
        <Link to={link}>
            <button className="action-filters">
                {linkText}
            </button>
        </Link> 
    </div>
);

export default Filters;